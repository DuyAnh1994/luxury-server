package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val userId: Int,
    val userName: String,
    val password: String,
    val fullName: String,
    val gender: String,
    val phoneNumber: Int,
    val email: String,
    val dataInfoId: Int,
    val addressId: Int,
    val reservationId: Int,
)