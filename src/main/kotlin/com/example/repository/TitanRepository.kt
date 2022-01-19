package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Titan

interface TitanRepository {

    val titans: List<Titan>

    suspend fun getAllTitans(page: Int = 1, limit: Int = 3): ApiResponse
    suspend fun searchTitans(name: String?): ApiResponse

}