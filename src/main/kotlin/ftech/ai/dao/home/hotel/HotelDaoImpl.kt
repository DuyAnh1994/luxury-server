package ftech.ai.dao.home.hotel

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.DataInfo
import ftech.ai.database.QuerySql
import ftech.ai.model.Hotel
import ftech.ai.model.Response
import ftech.ai.model.Success

class HotelDaoImpl : IHotelDao {
    override fun getHotel(idCity: Int): Response<MutableList<Hotel>> {
        val sqlListHotel = QuerySql.sqlListHotel(idCity)
        val response = Response<MutableList<Hotel>>(Success.CODE, Success.MSG)
        response.data = baseHotel(sqlListHotel)
        return response
    }

    override fun baseHotel(sql: String): MutableList<Hotel> {
        val result = ChangeDatabase.getData(sql)
        val list_hotel: MutableList<Hotel> = ArrayList()
        while (result.next()) {
            list_hotel.add(DataInfo.getHotel(result))
        }
        return list_hotel
    }

}