package ftech.ai.dao.home.room

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.QuerySql
import ftech.ai.model.*

class RoomDaoImpl : IRoomDao {
    override fun getRoom(idHotel: Int): Response<MutableList<Room>> {
        val sqlRoom = QuerySql.sqlRoom(idHotel)
        val result = ChangeDatabase.getData(sqlRoom)
        val listSelectRoom: MutableList<SelectRoom> = ArrayList()
        while (result.next()) {
            val id = result.getInt(1)
            val name = result.getString(2)
            val current = result.getFloat(3)
            val description = result.getString(4)
            val maxQuest = result.getString(5)
            val bedType = result.getString(6)
            val breakFast = result.getString(7)
            val refundable = result.getString(8)
            listSelectRoom.add(SelectRoom(id, name, current, description, maxQuest, bedType, breakFast, refundable))
        }

        val listImage: MutableList<ImageRoom> = getImage(idHotel)
        val listRoom: MutableList<Room> = ArrayList()
        val listImageRoom: MutableList<String> = ArrayList()
        for (selectRoom: SelectRoom in listSelectRoom) {
            for (image: ImageRoom in listImage) {
                if (selectRoom.id_room == image.id_room) {
                    listImageRoom.add(image.url)
                }
            }
            listRoom.add(Room(selectRoom, listImageRoom))
        }


        val response = Response<MutableList<Room>>(Success.code, Success.msg)
        response.data = listRoom

        return response

    }

    override fun getImage(idHotel: Int): MutableList<ImageRoom> {
        val sqlImage = QuerySql.sqlImageRoom(idHotel)
        val resultImage = ChangeDatabase.getData(sqlImage)
        val listImage: MutableList<ImageRoom> = ArrayList()
        while (resultImage.next()) {
            listImage.add(ImageRoom(resultImage.getString(1), resultImage.getInt(2)))
        }

        return listImage
    }
}