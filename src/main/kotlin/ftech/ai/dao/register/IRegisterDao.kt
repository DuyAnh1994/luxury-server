package ftech.ai.dao.register

import ftech.ai.model.Response
import ftech.ai.model.User
import ftech.ai.model.UserRegister

interface IRegisterDao {
    fun getUser(): MutableList<User>
    fun insertUser(user: UserRegister): Response<MutableList<User>>
    fun checkLogin(userName: String, password: String): Response<User>
}