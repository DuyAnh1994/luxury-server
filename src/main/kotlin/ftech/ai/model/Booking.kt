package ftech.ai.model

import kotlinx.serialization.Serializable
import java.util.Date

@Serializable
data class Booking(val user_id: Int, val room_id: Int, val checkin: String, val checkout: String)

@Serializable
data class BookingInfo(
    val booking_id: Int,
    val name_city: String,
    val name_hotel: String,
    val name_room: String,
    val image_room: String,
    val check_in: String,
    val check_out: String,
    val price_room: Double,
    val status: Int,
    val msg_tatus: String
)

@Serializable
data class Payment(
    val payment_id: Int,
    val user_id: Int,
    val room_id: Int,
    val check_in: String,
    val checkout: String,
    val price: Double
)