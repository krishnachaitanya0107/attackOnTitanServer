package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Titan
import com.example.models.Titans
import com.example.repository.DatabaseFactory.dbQuery
import com.example.utils.Constants.NEXT_PAGE_KEY
import com.example.utils.Constants.PREVIOUS_PAGE_KEY
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.statements.InsertStatement

class TitanRepositoryImpl : TitanRepository {

    override suspend fun getAllTitans(page: Int, limit: Int): ApiResponse {
        val titans = getAllTitansFromDb()
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                titans = titans,
                page = page,
                limit = limit
            )[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(
                titans = titans,
                page = page,
                limit = limit
            )[NEXT_PAGE_KEY],
            titans = provideTitans(
                titans = titans,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }


    private suspend fun getAllTitansFromDb(): List<Titan> {
        return dbQuery {
            Titans
                .selectAll()
                .orderBy(Titans.id to SortOrder.ASC)
                .map { rowToTitan(it) }
        }
    }


    private fun calculatePage(
        titans: List<Titan>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allTitans = titans.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allTitans.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allTitans.size) null else page + 1
        return mapOf(
            PREVIOUS_PAGE_KEY to prevPage,
            NEXT_PAGE_KEY to nextPage
        )
    }


    private fun provideTitans(
        titans: List<Titan>,
        page: Int,
        limit: Int
    ): List<Titan> {
        val allTitans = titans.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allTitans.size)
        return allTitans[page - 1]
    }

    override suspend fun searchTitans(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            titans = findTitans(query = name)
        )
    }

    private suspend fun findTitans(query: String?): List<Titan> {
        return if (query.isNullOrEmpty())
            emptyList()
        else
            dbQuery { Titans.select { Titans.name.lowerCase() like "%${query.lowercase()}%" }.map { rowToTitan(it) } }
    }


    private fun rowToTitan(row: ResultRow): Titan {
        return Titan(
            id = row[Titans.id],
            name = row[Titans.name],
            abilities = stringToList(row[Titans.abilities]),
            height = row[Titans.height],
            image = row[Titans.image],
            rating = row[Titans.rating],
            about = row[Titans.about],
            type = row[Titans.type],
            inheritors = stringToList(row[Titans.inheritors]),
            otherNames = stringToList(row[Titans.otherNames])
        )
    }

    private fun stringToList(string: String): List<String> {
        return string.split(",").map { it }
    }

    override suspend fun insertTitan(
        name: String, image: String, about: String, rating: Double, height: Int,
        type: String, inheritors: String, abilities: String, otherNames: String
    ): Boolean {

        var statement: InsertStatement<Number>? = null

        dbQuery {
            statement = Titans.insert { row ->
                row[Titans.name] = name
                row[Titans.image] = image
                row[Titans.height] = height
                row[Titans.about] = about
                row[Titans.rating] = rating
                row[Titans.type] = type
                row[Titans.abilities] = abilities
                row[Titans.inheritors] = inheritors
                row[Titans.otherNames] = otherNames
            }
        }

        return statement?.insertedCount == 1
    }

}