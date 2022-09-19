package ftech.ai.database

import ftech.ai.model.Flight
import ftech.ai.model.Hotel
import ftech.ai.model.Promotion
import ftech.ai.model.User
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
        val date: String = result.getDate(4).toString()

        return Flight(flightId, image, title, date)
    }

    fun getPromotion(result: ResultSet): Promotion {
        val promotionId: Int = result.getInt(1)
        val image: String = result.getString(2)

        return Promotion(promotionId, image)
    }

    fun getHotel(result: ResultSet): Hotel {
        val homeId: Int = result.getInt(1)
        val name: String = result.getString(2)
        val image: String = result.getString(3)
        val accommodationPolicies: String = result.getString(4)
        val description: String = result.getString(5)
        val star: Float = result.getFloat(6)
        return Hotel(homeId, name, image, accommodationPolicies, description, star)
    }
}