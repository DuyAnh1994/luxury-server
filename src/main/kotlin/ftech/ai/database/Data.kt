package ftech.ai.database

import ftech.ai.model.User
import java.sql.ResultSet

object Data {
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
}