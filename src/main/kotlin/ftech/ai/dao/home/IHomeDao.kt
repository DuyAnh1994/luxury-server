package ftech.ai.dao.home

import ftech.ai.model.*

interface IHomeDao {
    fun getHome(): Response<Home>
}