package ftech.ai.dao.home.room

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.DataInfo
import ftech.ai.database.QuerySql
import ftech.ai.model.*

class RoomDaoImpl : IRoomDao {
    override fun getRoom(idHotel: Int): Response<MutableList<Room>> {
        val sqlRoom = QuerySql.sqlRoom(idHotel)
        val result = ChangeDatabase.getData(sqlRoom)
        val listSelectRoom: MutableList<SelectRoom> = ArrayList()
        while (result.next()) {
            listSelectRoom.add(DataInfo.getRoom(result))
        }

        val listImage: MutableList<ImageRoom> = getImage(idHotel)
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

        if (listRoom.size > 0) {
            val response = Response<MutableList<Room>>(Success.code, Success.msg)
            response.data = listRoom

            return response
        }
        return Response(Fail.code, Fail.msg)

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