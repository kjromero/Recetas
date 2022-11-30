package com.kenny.recetas.di.modules

import com.kenny.recetas.di.qualifers.RetrofitBasic
import com.kenny.recipe.domain.services.RecipeService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object NetworkServiceModule {

    @Provides
    fun provideRecipeService(@RetrofitBasic retrofit: Retrofit): RecipeService {
        return retrofit.create(RecipeService::class.java)
    }

}