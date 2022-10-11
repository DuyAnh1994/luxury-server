package ftech.ai.dao.booking.search

import ftech.ai.model.*

interface ISearchDao {
    fun getSearchRoom(searchRoom: SearchRoom): Response<ResultRoom>
    fun getSearchHotel(searchHotel: SearchHotel): Response<ResultHotel>
    fun getInsert()
}