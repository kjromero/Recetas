package com.kenny.recetas.di.modules

import com.kenny.recetas.di.qualifers.BasePath
import com.kenny.recetas.di.qualifers.RetrofitBasic
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
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
        okHttpClient: OkHttpClient,
        @BasePath basePath: String
    ): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(basePath)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }
}