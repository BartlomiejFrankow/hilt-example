package com.example.outsidein.di

import android.content.Context
import com.example.outsidein.App
import com.example.outsidein.Car
import com.example.outsidein.Engine
import com.example.outsidein.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext appCtx: Context): App {
        return appCtx as App
    }

    @Singleton
    @Provides
    fun provideRandomString(): String = "Yoooo white boy!"

    @Singleton
    @Provides
    fun getEngine(): Engine = Engine()

    @Singleton
    @Provides
    fun getCar(): Car = Car(100.0, getEngine())

    @Singleton
    @Provides
    fun getMainViewModel(): MainViewModel = MainViewModel(provideRandomString(), getCar())

}
