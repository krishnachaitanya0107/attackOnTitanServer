package com.example.di

import com.example.repository.TitanRepository
import com.example.repository.TitanRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<TitanRepository> {
        TitanRepositoryImpl()
    }
}