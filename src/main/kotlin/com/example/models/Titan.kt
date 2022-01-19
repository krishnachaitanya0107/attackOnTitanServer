package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Titan (
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val height: Int,
    val type: String,
    val inheritors: List<String>,
    val abilities: List<String>,
    val otherNames: List<String>
)
