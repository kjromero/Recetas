package com.kenny.recipe.domain.usecases

import com.kenny.core.usecase.SingleUseCase
import com.kenny.recipe.domain.repositories.RecipeRepositoryImpl
import com.kenny.recipe.entities.data.RecipeDetail
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GetRecipeDetailUseCase @Inject constructor(
    private val recipeRepository: RecipeRepositoryImpl
) : SingleUseCase<Int, @JvmSuppressWildcards RecipeDetail>() {

    override fun execute(input: Int): Single<@JvmSuppressWildcards RecipeDetail> {
        return recipeRepository.getRecipeDetail(input)
    }
}