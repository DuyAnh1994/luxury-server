package ftech.ai.dao.register

import ftech.ai.model.User

interface IRegisterDao {
    fun getUser() : MutableList<User>
    fun insertUser(user : User) : Int
}