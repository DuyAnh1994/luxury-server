package ftech.ai.dao.register

import ftech.ai.model.Response
import ftech.ai.model.User

interface IRegisterDao {
    fun getUser(): MutableList<User>
    fun insertUser(user: User): Response<MutableList<User>>
    fun checkLogin(userName: String, password: String): Response<User>
}