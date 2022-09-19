package ftech.ai.dao.home

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.DataInfo
import ftech.ai.database.QuerySql
import ftech.ai.model.*

class HomeDaoImpl : IHomeDao {
    override fun getHome(): Response<Home> {
        val sqlFlight = QuerySql.getFlight()
        val sqlPromotion = QuerySql.getPromotion()
        val sqlHotel = QuerySql.getHotel()
        val listFlight: MutableList<Flight> = ArrayList()
        val listPromotion: MutableList<Promotion> = ArrayList()
        val listHotel: MutableList<Hotel> = ArrayList()

        val resultFlight = ChangeDatabase.getData(sqlFlight)
        while (resultFlight.next()) {
            listFlight.add(DataInfo.getFlight(resultFlight))
        }

        val resultPromotion = ChangeDatabase.getData(sqlPromotion)
        while (resultPromotion.next()) {
            listPromotion.add(DataInfo.getPromotion(resultPromotion))
        }

        val resultHotel = ChangeDatabase.getData(sqlHotel)
        while (resultHotel.next()) {
            listHotel.add(DataInfo.getHotel(resultHotel))
        }

        return if (listFlight.size > 0 && listPromotion.size > 0 && listHotel.size > 0) {
            val home = Home(listFlight, listPromotion, listHotel)
            val response = Response<Home>(Success.code, Success.msg)
            response.data = home

            response
        } else {
            Response(Fail.code, Fail.msg)
        }
    }

    override fun insertFlight(flight: Flight): Response<String> {
        val sqlFlight = QuerySql.insertFlight(flight)
        ChangeDatabase.setData(sqlFlight)
        return Response(Success.code, Success.msg)
    }

    override fun insertPromotion(promotion: Promotion): Response<String> {
        val sqlPromotion = QuerySql.insertPromotion(promotion)
        ChangeDatabase.setData(sqlPromotion)
        return Response(Success.code, Success.msg)
    }

    override fun insertHotel(hotel: Hotel): Response<String> {
        val sqlHotel = QuerySql.insertHotel(hotel)
        ChangeDatabase.setData(sqlHotel)
        return Response(Success.code, Success.msg)
    }

}