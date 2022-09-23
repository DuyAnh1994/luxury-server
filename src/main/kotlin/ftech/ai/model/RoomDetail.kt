package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class RoomDetail(
    val listImageRoom: MutableList<String>,
    val roomInfo: RoomInfo,
    val listRoomFeature: MutableList<String>,
    val listRoomFacilities: MutableList<String>,
    val listBathroom: MutableList<String>
)

@Serializable
data class RoomInfo(
    val id_room: Int, val name: String, val guest: String, val room_size: String,
    val bed_type: String, val extra_benefit: String, val reschedule: String
)

