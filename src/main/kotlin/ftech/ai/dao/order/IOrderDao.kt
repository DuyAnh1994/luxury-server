package ftech.ai.dao.order

import ftech.ai.model.*

interface IOrderDao {
    fun getListFood(): Response<FoodTotal>
    fun getListDrink(): Response<DrinkTotal>
    fun getListLocation(): Response<LocationReceiveTotal>
    fun getFoodDetail(id: Int): Response<FoodDetail>
    fun getDrinkDetail(id: Int): Response<DrinkDetail>
    fun getOrder(order: Order): Response<OrderTotal>
    fun cancelOrder(id: Int): Response<OrderTotal>
}