package ftech.ai.dao.register

import ftech.ai.model.User

interface IUserDao {
    fun getUser() : MutableList<User>
    fun insertUser(sql : String) : String
}