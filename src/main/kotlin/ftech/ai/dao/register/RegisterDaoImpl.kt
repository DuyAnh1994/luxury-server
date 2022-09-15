package ftech.ai.dao.register

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.QuerySql
import ftech.ai.model.User


class RegisterDaoImpl : IRegisterDao {

    private val listUser: MutableList<User> = ArrayList()

    override fun getUser(): MutableList<User> {
        val sql = "Select * from user"
        val result = ChangeDatabase.getData(sql)
        while (result.next()) {
            val userId: Int = result.getInt(1)
            val userName: String = result.getString(2)
            val password: String = result.getString(3)
            val fullName: String = result.getString(4)
            val gender: String = result.getString(5)
            val phoneNumber: Int = result.getInt(6)
            val birthday: String = result.getDate(7).toString()
            val user = User(
                userId,
                userName,
                password,
                fullName,
                gender,
                phoneNumber,
                birthday
            )
            listUser.add(user)
        }

        return listUser
    }

    override fun insertUser(user: User): Int {
        val sqlCheck = QuerySql.checkEmail(user.userName)
        val result = ChangeDatabase.getData(sqlCheck)
        if (result.getInt(1) == 1) {
            val sqlInsert = QuerySql.insertUser(user)
            if (ChangeDatabase.setData(sqlInsert) == "1") {
                return 1
            }
            return 0
        } else {
            return -1
        }
    }

}