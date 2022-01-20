package com.example.models

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object Titans : Table() {
    val id: Column<Int> = integer("id").autoIncrement()
    val name = varchar("name", 512)
    val image = varchar("image", 512)
    val about = varchar("about", 1024)
    val rating = double("rating")
    val height: Column<Int> = integer("height")
    val type = varchar("type", 512)
    val inheritors = varchar("inheritors", 1024)
    val abilities = varchar("abilities", 1024)
    val otherNames = varchar("otherNames", 1024)
}