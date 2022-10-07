package ftech.ai.dao.booking.search

import ftech.ai.database.ChangeDatabase
import ftech.ai.model.*

interface ISearchDao {
    fun getSearchRoom(searchRoom: SearchRoom): Response<MutableList<Room>>
    fun getSearchHotel(searchHotel: SearchHotel): Response<MutableList<Hotel>>
    fun getInsert()
}