package ftech.ai.dao.register

import ftech.ai.database.ChangeDatabase
import ftech.ai.model.User


class UserDaoImpl : IUserDao {

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
            val email: String = result.getString(7)
            val dataInfoId: Int = result.getInt(8)
            val addressId: Int = result.getInt(9)
            val reservationId: Int = result.getInt(10)
            val user = User(
                userId,
                userName,
                password,
                fullName,
                gender,
                phoneNumber,
                email,
                dataInfoId,
                addressId,
                reservationId
            )
            listUser.add(user)
        }

        return listUser
    }

    override fun insertUser(sql: String): String {
        return ChangeDatabase.setData(sql)
    }
}