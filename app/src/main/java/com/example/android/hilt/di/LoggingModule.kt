package com.example.android.hilt.di

import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.data.LoggerInMemoryDataSource
import com.example.android.hilt.data.LoggerLocalDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LoggingLocalDataModule {

    @Singleton
    @Binds
    abstract fun bindLoggerLocalDataSource(impl: LoggerLocalDataSource): LoggerDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class LoggingInMemoryDataModule {

    @ActivityScoped
    @Binds
    abstract fun bindLoggerInMemoryDataSource(impl: LoggerInMemoryDataSource): LoggerDataSource
}
