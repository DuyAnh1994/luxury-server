package com.example.dao

import com.example.database.ConnectDatabase
import com.example.model.User

class UserDaoImpl : IUserDao {
    override fun getAllUser(): MutableList<User> {
        val listUser: MutableList<User> = ArrayList()
        try {
            val conn = ConnectDatabase().getConnection()
            val ps = conn!!.createStatement()
            val sql = "Select * From user"
            val rs = ps!!.executeQuery(sql)
            while (rs.next()) {
                val tk = rs.getInt(1)
                val mk = rs.getString(2)
                val user = User(tk, mk)
                listUser.add(user)
            }
            ps.close()
            rs.close()
        } catch (e: Exception) {
            e.message
        }
        return listUser
    }
}