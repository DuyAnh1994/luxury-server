package ftech.ai.dao.home

import ftech.ai.model.*

interface IHomeDao {
    fun getHome(): Response<Home>
    fun insertHotel(hotel: Hotel): Response<String>
    fun insertPromotion(promotion: Promotion): Response<String>
    fun insertFlight(flight: Flight): Response<String>
}