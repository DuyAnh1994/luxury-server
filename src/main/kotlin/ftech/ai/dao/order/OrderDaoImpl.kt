package ftech.ai.dao.order

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.DataInfo
import ftech.ai.model.*

class OrderDaoImpl : IOrderDao {
    override fun getListFood(): Response<FoodTotal> {
        val sql: String = " select  foodID, name,image,price from travelluxury.food"
        val listFood: MutableList<Food> = ArrayList()
        val result = ChangeDatabase.getData(sql)
        while (result.next()) {
            val id = result.getInt(1)
            val name = result.getString(2)
            val image = result.getString(3)
            val price = result.getInt(4)
            listFood.add(Food(id, name, image, price))
        }
        val response = Response<FoodTotal>(Success.CODE, Success.MSG)
        response.data = FoodTotal("Đồ ăn", listFood)
        return response
    }

    override fun getListDrink(): Response<DrinkTotal> {
        val sql: String = " select  drinkID, name,image,price,percentDiscount from travelluxury.drink"
        val listDrink: MutableList<Drink> = ArrayList()
        val result = ChangeDatabase.getData(sql)
        while (result.next()) {
            val id = result.getInt(1)
            val name = result.getString(2)
            val image = result.getString(3)
            val price = result.getInt(4)
            val percentDiscount = result.getInt(5)
            listDrink.add(Drink(id, name, image, price, percentDiscount))
        }
        val response = Response<DrinkTotal>(Success.CODE, Success.MSG)
        response.data = DrinkTotal("Đồ uống", listDrink)
        return response
    }

    override fun getListLocation(): Response<LocationReceiveTotal> {
        val sql: String = " select  locationID, name,distance from travelluxury.location"
        val listLocation: MutableList<LocationReceive> = ArrayList()
        val result = ChangeDatabase.getData(sql)
        while (result.next()) {
            val id = result.getInt(1)
            val name = result.getString(2)
            val percentDiscount = result.getString(3)
            listLocation.add(LocationReceive(id, name, percentDiscount))
        }
        val response = Response<LocationReceiveTotal>(Success.CODE, Success.MSG)
        response.data = LocationReceiveTotal("Các cơ sở gần nhất ", listLocation)
        return response
    }

    override fun getFoodDetail(id: Int): Response<FoodDetail> {
        val sql = "select * from travelluxury.food where foodID = '${id}' "
        val result = ChangeDatabase.getData(sql)
        result.first()
        val id: Int = result.getInt(1)
        val name: String = result.getString(2)
        val price: Int = result.getInt(3)
        val count: Int = result.getInt(4)
        val ship_price: Int = result.getInt(5)
        val total_price: Int = result.getInt(6)
        val image: String = result.getString(7)
        val foodDetail = FoodDetail(id, name, price, count, ship_price, total_price, image)
        val response = Response<FoodDetail>(Success.CODE, Success.MSG)
        response.data = foodDetail
        return response
    }

    override fun getDrinkDetail(id: Int): Response<DrinkDetail> {
        val sql = "select * from travelluxury.drink where drinkID = '${id}' "
        val result = ChangeDatabase.getData(sql)
        result.first()
        val id: Int = result.getInt(1)
        val name: String = result.getString(2)
        val price: Int = result.getInt(3)
        val size: String = result.getString(4)
        val count: Int = result.getInt(5)
        val discount: Int = result.getInt(6)
        val percent_discount: Int = result.getInt(7)
        val image: String = result.getString(8)
        val shipPrice: Int = result.getInt(9)
        val paymentChannel = result.getString(10)
        val totalPrice: Int = result.getInt(11)

        val drinkDetail = DrinkDetail(
            id, name, price, size, count, discount, percent_discount, image, shipPrice, paymentChannel, totalPrice
        )
        val response = Response<DrinkDetail>(Success.CODE, Success.MSG)
        response.data = drinkDetail
        return response
    }

    override fun getOrder(order: Order): Response<OrderTotal> {
        val sql = "Insert into travelluxury.order(name,totalPrice,status) value('${order.name}','${order.price}','0')"
        ChangeDatabase.setData(sql)
        return baseOrder()
    }

    override fun cancelOrder(id: Int): Response<OrderTotal> {
        val sql = "delete from travelluxury.order where orderID = '${id}' "
        ChangeDatabase.setData(sql)
        return baseOrder()
    }

    private fun baseOrder(): Response<OrderTotal> {
        val sqlGet = "select * from travelluxury.order"
        val result = ChangeDatabase.getData(sqlGet)
        val listOrder: MutableList<OrderHistory> = ArrayList()
        while (result.next()) {
            listOrder.add(DataInfo.orderTotal(result))
        }
        val response = Response<OrderTotal>(Success.CODE, Success.MSG)
        response.data = OrderTotal("Lịch sử đặt hàng", listOrder)
        return response
    }

}