package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class RoomDetail(
    val list_image_room: MutableList<String>,
    val list_room_info: RoomInfo,
    val list_room_feature: MutableList<String>,
    val list_room_facilities: MutableList<String>,
    val list_bathroom: MutableList<String>
)

@Serializable
data class RoomInfo(
    val id_room: Int, val name: String, val guest: String, val room_size: String,
    val bed_type: String, val extra_benefit: String, val reschedule: String, val formula: String, val sell: Int
)

