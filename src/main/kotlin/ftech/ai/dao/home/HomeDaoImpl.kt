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
        val list_flight: MutableList<Flight> = ArrayList()
        val list_promotion: MutableList<Promotion> = ArrayList()
        val list_city: MutableList<City> = ArrayList()

        val resultFlight = ChangeDatabase.getData(sqlFlight)
        while (resultFlight.next()) {
            list_flight.add(DataInfo.getFlight(resultFlight))
        }

        val resultPromotion = ChangeDatabase.getData(sqlPromotion)
        while (resultPromotion.next()) {
            list_promotion.add(DataInfo.getPromotion(resultPromotion))
        }

        val resultCity = ChangeDatabase.getData(sqlCity)
        while (resultCity.next()) {
            list_city.add(DataInfo.getCity(resultCity))
        }

        return if (list_flight.size > 0 && list_promotion.size > 0 && list_city.size > 0) {
            val home = Home(list_flight, list_promotion, list_city)
            val response = Response<Home>( Success.CODE, Success.MSG)
            response.data = home

            response
        } else {
            Response( Fail.CODE, Fail.MSG)
        }
    }

}