package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class Room(val room: SelectRoom, val list_image: MutableList<String>)

@Serializable
data class SelectRoom(
    val id_room: Int,
    val name: String,
    val current_price: Float,
    val max_guest: String,
    val bed_type: String,
    val break_fast: String,
    val refundable: String,
    val formula: String,
    val sell: Int
)

@Serializable
data class ImageRoom(val url: String, val id_room: Int)
