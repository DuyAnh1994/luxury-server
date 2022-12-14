package ftech.ai.dao.home.room


import ftech.ai.model.ImageRoom
import ftech.ai.model.Response
import ftech.ai.model.Room

interface IRoomDao {
    fun getRoom(idHotel: Int): Response<MutableList<Room>>
    fun baseRoom(sql: String): MutableList<Room>
    fun getImage(): MutableList<ImageRoom>
}