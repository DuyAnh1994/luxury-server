package ftech.ai.dao.home.room.roomdetail

import ftech.ai.model.Response
import ftech.ai.model.RoomDetail
import ftech.ai.model.RoomInfo

interface IRoomDetailDao {
    fun getRoomDetail(idRoom: Int): Response<RoomDetail>
    fun getImageRoom(idRoom: Int): MutableList<String>
    fun getRoomInfo(idRoom: Int): RoomInfo
    fun listRoomFeature(idRoom: Int): MutableList<String>
    fun listRoomFacilities(idRoom: Int): MutableList<String>
    fun listBathroom(idRoom: Int): MutableList<String>
}