package com.example.repository

import com.example.models.Titans
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import java.net.URI

object DatabaseFactory {

    fun init() {
        Database.connect(hikari())

        transaction {
            SchemaUtils.create(Titans)
        }
    }

    private fun hikari(): HikariDataSource {
        val config = HikariConfig()
        config.driverClassName = System.getenv("JDBC_DRIVER")
        val dbUri= URI(System.getenv("DATABASE_URL"))
        val username=dbUri.userInfo.split(":").toTypedArray()[0]
        val password=dbUri.userInfo.split(":").toTypedArray()[1]
        val dbUrl="jdbc:postgresql://"+dbUri.host+":"+dbUri.port+dbUri.path+"?sslmode=require"+"&user=$username&password=$password"
        config.jdbcUrl = dbUrl
        config.maximumPoolSize = 3
        config.isAutoCommit = false
        config.transactionIsolation = "TRANSACTION_REPEATABLE_READ"

        config.validate()
        return HikariDataSource(config)
    }

    suspend fun <T> dbQuery(block: () -> T): T =
        withContext(Dispatchers.IO) {
            transaction { block() }
        }
}