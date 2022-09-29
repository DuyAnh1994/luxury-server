package ftech.ai.model

import kotlinx.serialization.Serializable


@Serializable
data class User(
    val user_id: Int,
    val user_name: String,
    val password: String,
    val full_name: String,
    val gender: String,
    val phone_number: Int,
    val birthday: String,
)

@Serializable
data class UserRegister(
    val user_name: String,
    val password: String,
    val full_name: String,
    val gender: String,
    val phone_number: Int,
    val birthday: String,
)
