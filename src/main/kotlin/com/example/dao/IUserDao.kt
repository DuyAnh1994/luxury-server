package com.example.dao

import com.example.model.User

interface IUserDao {
    fun getAllUser()  : MutableList<User>
}