package com.example.bluepocket.model

data class MovimentationD(
    var id: String = "",
    val name: String = "",
    val type: String = "",
    val date: String = "",
    val expense: Boolean = true,
    val value: Double = 0.0,
    val userID: String = "0"
)