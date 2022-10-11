package ftech.ai.database

import ftech.ai.model.*
import java.sql.ResultSet

object DataInfo {
    fun getUser(result: ResultSet): User {
        val userID: Int = result.getInt(1)
        val userName: String = result.getString(2)
        val password: String = result.getString(3)
        val fullName: String = result.getString(4)
        val gender: String = result.getString(5)
        val phoneNumber: Int = result.getInt(6)
        val birthday: String = result.getDate(7).toString()

        return User(userID, userName, password, fullName, gender, phoneNumber, birthday)
    }

    fun getFlight(result: ResultSet): Flight {
        val flightId: Int = result.getInt(1)
        val image: String = result.getString(2)
        val title: String = result.getString(3)
        val date: String = result.getString(4)

        return Flight(flightId, image, title, date)
    }

    fun getPromotion(result: ResultSet): Promotion {
        val promotionId: Int = result.getInt(1)
        val image: String = result.getString(2)

        return Promotion(promotionId, image)
    }

    fun getHotel(result: ResultSet): Hotel {
        val id: Int = result.getInt(1)
        val name: String = result.getString(2)
        val star: Float = result.getFloat(3)
        val address: String = result.getString(4)
        val point: Float = result.getFloat(5)
        val count: Int = result.getInt(6)
        val price: Int = result.getInt(7)
        val image: String = result.getString(8)
        return Hotel(id, name, star, address, point, count, price, image)
    }

    fun getCity(result: ResultSet): City {
        val id: Int = result.getInt(1)
        val name: String = result.getString(2)
        val image: String = result.getString(3)
        return City(id, name, image)
    }

    fun getRoom(result: ResultSet): SelectRoom {
        val id = result.getInt(1)
        val name = result.getString(2)
        val current = result.getFloat(3)
        val maxQuest = result.getString(4)
        val bedType = result.getString(5)
        val breakFast = result.getString(6)
        val refundable = result.getString(7)
        val formula: String = result.getString(8)
        val sell: Int = result.getInt(9)
        return SelectRoom(id, name, current, maxQuest, bedType, breakFast, refundable, formula, sell)
    }

    fun getRoomInfo(result: ResultSet): RoomInfo {
        val id: Int = result.getInt(1)
        val name: String = result.getString(2)
        val guest: String = result.getString(3)
        val size: String = result.getString(4)
        val bed: String = result.getString(5)
        val extra: String = result.getString(6)
        val reschedule: String = result.getString(7)
        val formula: String = result.getString(8)
        val sell: Int = result.getInt(9)
        return RoomInfo(id, name, guest, size, bed, extra, reschedule, formula, sell)
    }

    fun getBookingInfo(result: ResultSet): BookingInfo {
        val bookingId: Int = result.getInt(1)
        val roomId: Int = result.getInt(2)
        val nameCity: String = result.getString(3)
        val nameHotel: String = result.getString(4)
        val imageRoom: String = result.getString(5)
        val checkin: String = result.getDate(6).toString()
        val checkout: String = result.getDate(7).toString()
        val priceRoom: Double = result.getDouble(8)
        val status: Int = result.getInt(9)
        val msgStatus: String = result.getString(10)
        return BookingInfo(
            bookingId, roomId, nameCity, nameHotel, imageRoom, checkin, checkout, priceRoom, status, msgStatus
        )
    }

    fun getBooking(result: ResultSet): Booking {
        val userId: Int = result.getInt(1)
        val roomId: Int = result.getInt(2)
        val checkin: String = result.getDate(3).toString()
        val checkout: String = result.getDate(4).toString()
        return Booking(userId, roomId, checkin, checkout)
    }

    fun getHistory(result: ResultSet): Payment {
        val payment_id: Int = result.getInt(1)
        val user_id: Int = result.getInt(2)
        val room_id: Int = result.getInt(3)
        val check_in: String = result.getDate(4).toString()
        val checkout: String = result.getDate(5).toString()
        val price: Double = result.getDouble(6)

        return Payment(payment_id, user_id, room_id, check_in, checkout, price)
    }

}