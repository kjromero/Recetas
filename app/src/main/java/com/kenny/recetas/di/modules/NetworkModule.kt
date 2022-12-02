package com.kenny.recetas.di.modules

import com.google.gson.GsonBuilder
import com.kenny.recetas.di.qualifers.BasePath
import com.kenny.recetas.di.qualifers.RetrofitBasic
import com.kenny.recetas.di.qualifers.RetrofitRecipes
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

const val BASE_URL = "https://api.spoonacular.com/"

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Provides
    @Singleton
    @BasePath
    fun providesBasePath(): String {
        return BASE_URL
    }

    @Provides
    @Singleton
    @RetrofitBasic
    fun providesRetrofitBasic(
        @BasePath basePath: String
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(basePath)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }

}