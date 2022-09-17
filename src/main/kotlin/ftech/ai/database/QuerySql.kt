package ftech.ai.database

import ftech.ai.model.User
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


object QuerySql {
    const val tbUser: String = "travelluxury.user"
    fun checkEmail(email: String): String {
        return "select count(userID) as sl from ${tbUser} group by travelluxury.user.userName having travelluxury.user.userName = '${email}'"
    }

    fun insertUser(user: User): String {
        val stringDate = user.birthday
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH)
        val birthday = LocalDate.parse(stringDate, formatter)
        return "insert into ${tbUser}(userName,password,fullName,gender,phoneNumber,birthday) values('${user.user_name}','${user.password}','${user.full_name}','${user.gender}','${user.phone_number}','${birthday}')"
    }

    fun checkLogin(username: String, password: String): String {
        return "select * from ${tbUser} Where ${tbUser}.userName = '${username}' AND ${tbUser}.password = '${password}'"
    }
}