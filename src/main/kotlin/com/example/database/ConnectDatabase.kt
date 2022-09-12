package com.example.database

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException


class ConnectDatabase {
    @Throws(ClassNotFoundException::class)
    fun getConnection(): Connection? {
        var connection: Connection? = null
        try {
            Class.forName("com.mysql.cj.jdbc.Driver")
            val url = "jdbc:mysql://localhost:3306/travelluxury?zeroDateTimeBehavior=CONVERT_TO_NULL"
            val user = "root"
            val password = "vucuong120401"
            connection = DriverManager.getConnection(url, user, password)
        } catch (ex: SQLException) {
            print(ex.localizedMessage)
        }
        return connection
    }
}