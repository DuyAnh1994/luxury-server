package ftech.ai.dao.home.room.roomdetail

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.DataInfo
import ftech.ai.database.QuerySql
import ftech.ai.model.Response
import ftech.ai.model.RoomDetail
import ftech.ai.model.RoomInfo
import ftech.ai.model.Success

class RoomDetailDaoImpl : IRoomDetailDao {
    override fun getRoomDetail(idRoom: Int): Response<RoomDetail> {
        val listImageRoom: MutableList<String> = getImageRoom(idRoom)
        val roomInfo: RoomInfo = getRoomInfo(idRoom)
        val listRoomFeature: MutableList<String> = listRoomFeature(idRoom)
        val listRoomFacilities: MutableList<String> = listRoomFacilities(idRoom)
        val listBathroom: MutableList<String> = listBathroom(idRoom)
        val response = Response<RoomDetail>(Success.code, Success.msg)
        response.data = RoomDetail(listImageRoom, roomInfo, listRoomFeature, listRoomFacilities, listBathroom)
        return response
    }

    override fun getImageRoom(idRoom: Int): MutableList<String> {
        val sqlImage = QuerySql.sqlImageRoomDetail(idRoom)
        val result = ChangeDatabase.getData(sqlImage)
        val listImage: MutableList<String> = ArrayList()
        while (result.next()) {
            listImage.add(result.getString(1))
        }
        return listImage
    }

    override fun getRoomInfo(idRoom: Int): RoomInfo {
        val sqlRoomDetail = QuerySql.sqlRoomInfo(idRoom)
        val result = ChangeDatabase.getData(sqlRoomDetail)
        result.next()
        return DataInfo.getRoomInfo(result)
    }

    override fun listRoomFeature(idRoom: Int): MutableList<String> {
        val sqlRoomFeature = QuerySql.sqlRoomFeature(idRoom)
        val result = ChangeDatabase.getData(sqlRoomFeature)
        val listRoomFeature: MutableList<String> = ArrayList()
        while (result.next()) {
            listRoomFeature.add(result.getString(1))
        }
        return listRoomFeature
    }

    override fun listRoomFacilities(idRoom: Int): MutableList<String> {
        val sqlRoomFacilities = QuerySql.sqlRoomFacilities(idRoom)
        val result = ChangeDatabase.getData(sqlRoomFacilities)
        val listRoomFacilities: MutableList<String> = ArrayList()
        while (result.next()) {
            listRoomFacilities.add(result.getString(1))
        }
        return listRoomFacilities
    }

    override fun listBathroom(idRoom: Int): MutableList<String> {
        val sqlBathroom = QuerySql.sqlBathroom(idRoom)
        val result = ChangeDatabase.getData(sqlBathroom)
        val listBathroom: MutableList<String> = ArrayList()
        while (result.next()) {
            listBathroom.add(result.getString(1))
        }
        return listBathroom
    }
}