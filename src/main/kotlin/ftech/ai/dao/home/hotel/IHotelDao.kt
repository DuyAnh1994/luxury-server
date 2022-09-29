package ftech.ai.dao.home.hotel

import ftech.ai.model.Hotel
import ftech.ai.model.Response

interface IHotelDao {
    fun getHotel(idCity: Int): Response<MutableList<Hotel>>
}