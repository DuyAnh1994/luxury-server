package ftech.ai.dao.home.hoteldetail

import ftech.ai.model.*

interface IDetailDao {
    fun hotelDetail(idHotel: Int): Response<HotelDetail>
    fun getImageDetail(idHotel: Int): MutableList<String>
    fun getRating(idHotel: Int): Rating
    fun getHotelInfo(idHotel: Int): HotelInfo
    fun getFacilities(idHotel: Int): MutableList<String>
    fun getPolicies(idHotel: Int): MutableList<Policies>
    fun getDescription(idHotel: Int): MutableList<String>
}