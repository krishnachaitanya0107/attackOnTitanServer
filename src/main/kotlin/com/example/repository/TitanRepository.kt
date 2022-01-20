package com.example.repository

import com.example.models.ApiResponse

interface TitanRepository {

    suspend fun getAllTitans(page: Int = 1, limit: Int = 3): ApiResponse
    suspend fun searchTitans(name: String?): ApiResponse
    suspend fun insertTitan(
        name: String, image: String, about: String, rating: Double, height: Int,
        type: String, inheritors: String, abilities: String, otherNames: String
    ): Boolean

}