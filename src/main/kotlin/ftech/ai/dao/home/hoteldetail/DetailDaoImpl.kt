package ftech.ai.dao.home.hoteldetail

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.QuerySql
import ftech.ai.model.*

class DetailDaoImpl : IDetailDao {
    override fun hotelDetail(idHotel: Int): Response<HotelDetail> {
        TODO("Not yet implemented")
    }

    override fun getImageDetail(idHotel: Int): MutableList<String> {
        val sqlImage = QuerySql.sqlImageDetail(idHotel)
        val result = ChangeDatabase.getData(sqlImage)
        val listImage: MutableList<String> = ArrayList()
        while (result.next()) {
            listImage.add(result.getString(1))
        }

        return listImage
    }

    override fun getRating(idHotel: Int): Rating {
        TODO("Not yet implemented")
    }

    override fun getHotelInfo(idHotel: Int): HotelInfo {
        TODO("Not yet implemented")
    }

    override fun getFacilities(idHotel: Int): MutableList<String> {
        val sqlFacilities = QuerySql.sqlFacilities(idHotel)
        val result = ChangeDatabase.getData(sqlFacilities)
        val listFacilities: MutableList<String> = ArrayList()
        while (result.next()) {
            listFacilities.add(result.getString(1))
        }

        return listFacilities
    }

    override fun getPolicies(idHotel: Int): MutableList<Policies> {
        val sqlPolicies = QuerySql.sqlPolicies(idHotel)
        val result = ChangeDatabase.getData(sqlPolicies)
        val listPolicies: MutableList<Policies> = ArrayList()
        while (result.next()) {
            listPolicies.add(Policies(result.getString(1), result.getString(2)))
        }

        return listPolicies
    }

    override fun getDescription(idHotel: Int): MutableList<String> {
        val sqlDescription = QuerySql.sqlDescription(idHotel)
        val result = ChangeDatabase.getData(sqlDescription)
        val listDescription: MutableList<String> = ArrayList()
        while (result.next()) {
            listDescription.add(result.getString(1))
        }

        return listDescription
    }
}