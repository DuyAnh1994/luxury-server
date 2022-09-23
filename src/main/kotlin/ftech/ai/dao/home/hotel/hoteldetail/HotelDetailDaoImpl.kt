package ftech.ai.dao.home.hotel.hoteldetail

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.QuerySql
import ftech.ai.model.*

class HotelDetailDaoImpl : IHotelDetailDao {
    override fun hotelDetail(idHotel: Int): Response<HotelDetail> {
        val response = Response<HotelDetail>(Success.code, Success.msg)
        response.data = HotelDetail(
            getImageDetail(idHotel),
            getHotelInfo(idHotel),
            getRating(idHotel),
            getFacilities(idHotel),
            getPolicies(idHotel),
            getDescription(idHotel)
        )

        return response
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
        val sqlRating = QuerySql.sqlRating(idHotel)
        val result = ChangeDatabase.getData(sqlRating)
        result.next()
        return Rating(result.getFloat(1), result.getInt(2))
    }

    override fun getHotelInfo(idHotel: Int): HotelInfo {
        val sqlDetailInfo = QuerySql.sqlHotelInfo(idHotel)
        val result = ChangeDatabase.getData(sqlDetailInfo)
        result.next()
        return HotelInfo(result.getInt(1), result.getString(2), result.getFloat(3), result.getString(4))
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