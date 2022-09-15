package ftech.ai.database

import ftech.ai.model.User

object QuerySql {
    fun checkEmail(email: String): String {
        return "select count(userID) from travelluxury.user group by user.userName having userName = '${email}'"
    }

    fun insertUser(user: User): String {
        return "insert into travelluxury.user(userName,password,fullName,gender,phoneNumber,birthday)" +
                "  values('${user.userName}','${user.password}','${user.fullName}','${user.gender}'," +
                "'${user.phoneNumber}','${user.birthday}')"
    }
}