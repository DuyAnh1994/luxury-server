package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class Room(val selectRoom: SelectRoom, val listImage: MutableList<String>)

@Serializable
data class SelectRoom(
    val id_room: Int,
    val name: String,
    val current_price: Float,
    val description: String,
    val max_guest: String,
    val bed_type: String,
    val break_fast: String,
    val refundable: String,
)

@Serializable
data class ImageRoom(val url: String, val id_room: Int)
