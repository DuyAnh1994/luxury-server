package ftech.ai.dao.home.room

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.DataInfo
import ftech.ai.database.QuerySql
import ftech.ai.model.*

class RoomDaoImpl : IRoomDao {
    override fun getRoom(idHotel: Int): Response<MutableList<Room>> {
        val sqlRoom = QuerySql.sqlRoom(idHotel)

        val response = Response<MutableList<Room>>(Success.CODE, Success.MSG)
        response.data = baseRoom(sqlRoom)
        return response
    }

    override fun baseRoom(sql: String): MutableList<Room> {
        val result = ChangeDatabase.getData(sql)
        val listSelectRoom: MutableList<SelectRoom> = ArrayList()
        while (result.next()) {
            listSelectRoom.add(DataInfo.getRoom(result))
        }

        val listImage: MutableList<ImageRoom> = getImage()
        val listRoom: MutableList<Room> = ArrayList()
        for (selectRoom: SelectRoom in listSelectRoom) {
            val listImageRoom: MutableList<String> = ArrayList()
            for (image: ImageRoom in listImage) {
                if (image.id_room == selectRoom.id_room) {
                    listImageRoom.add(image.url)
                }
            }
            listRoom.add(Room(selectRoom, listImageRoom))
        }

        return listRoom
    }


    override fun getImage(): MutableList<ImageRoom> {
        val sqlImage = QuerySql.sqlImageRoom()
        val resultImage = ChangeDatabase.getData(sqlImage)
        val listImage: MutableList<ImageRoom> = ArrayList()
        while (resultImage.next()) {
            listImage.add(ImageRoom(resultImage.getString(1), resultImage.getInt(2)))
        }
        return listImage
    }
}