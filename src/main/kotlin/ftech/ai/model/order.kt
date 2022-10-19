package ftech.ai.model

import kotlinx.serialization.Serializable

@Serializable
data class FoodTotal(val title: String, val list_food: MutableList<Food>)

@Serializable
data class Food(val id: Int, val name: String, val image: String, val price: Int)

@Serializable
data class FoodDetail(
    val id: Int,
    val name: String,
    val price: Int,
    val count: Int,
    val ship_price: Int,
    val total_price: Int,
    val image: String,
)

@Serializable
data class DrinkTotal(val title: String, val list_drink: MutableList<Drink>)

@Serializable
data class Drink(val id: Int, val name: String, val image: String, val price: Int, val percent_discount: Int)

@Serializable
data class DrinkDetail(
    val id: Int,
    val name: String,
    val price: Int,
    val size: String,
    val count: Int,
    val discount: Int,
    val percent_discount: Int,
    val image: String,
    val ship_price: Int,
    val paymentChannel: String,
    val total_price: Int,
)

@Serializable
data class LocationReceiveTotal(val title: String, val list_location: MutableList<LocationReceive>)

@Serializable
data class LocationReceive(val id: Int, val name: String, val distance: String)

@Serializable
data class Order(val name: String, val price: Int)

@Serializable
data class OrderHistory(val id: Int, val name: String, val total: Int, val status: Int)

@Serializable
data class OrderTotal(val title: String, val list_order: MutableList<OrderHistory>)
