package ftech.ai.dao.home

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.DataInfo
import ftech.ai.database.QuerySql
import ftech.ai.model.*

class HomeDaoImpl : IHomeDao {
    override fun getHome(): Response<Home> {
        val sqlFlight = QuerySql.getFlight()
        val sqlPromotion = QuerySql.getPromotion()
        val sqlCity = QuerySql.getCity()
        val listFlight: MutableList<Flight> = ArrayList()
        val listPromotion: MutableList<Promotion> = ArrayList()
        val listCity: MutableList<City> = ArrayList()

        val resultFlight = ChangeDatabase.getData(sqlFlight)
        while (resultFlight.next()) {
            listFlight.add(DataInfo.getFlight(resultFlight))
        }

        val resultPromotion = ChangeDatabase.getData(sqlPromotion)
        while (resultPromotion.next()) {
            listPromotion.add(DataInfo.getPromotion(resultPromotion))
        }

        val resultCity = ChangeDatabase.getData(sqlCity)
        while (resultCity.next()) {
            listCity.add(DataInfo.getCity(resultCity))
        }

        return if (listFlight.size > 0 && listPromotion.size > 0 && listCity.size > 0) {
            val home = Home(listFlight, listPromotion, listCity)
            val response = Response<Home>(Success.code, Success.msg)
            response.data = home

            response
        } else {
            Response(Fail.code, Fail.msg)
        }
    }

}