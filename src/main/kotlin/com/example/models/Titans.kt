package com.example.models

import com.example.utils.Constants
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object Titans : Table() {
    val id: Column<Int> = integer(Constants.ID).autoIncrement()
    val name = varchar(Constants.NAME, 512)
    val image = varchar(Constants.IMAGE, 512)
    val about = varchar(Constants.ABOUT, 1024)
    val rating = double(Constants.RATING)
    val height: Column<Int> = integer(Constants.HEIGHT)
    val type = varchar(Constants.TYPE, 512)
    val inheritors = varchar(Constants.INHERITORS, 1024)
    val abilities = varchar(Constants.ABILITIES, 1024)
    val otherNames = varchar(Constants.OTHER_NAMES, 1024)
}