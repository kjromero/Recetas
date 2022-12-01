package com.kenny.recipe.domain.usecases

import com.kenny.recipe.domain.repositories.RecipeRepositoryImpl
import com.kenny.recipe.entities.data.Recipe
import com.kenny.core.usecase.SingleUseCase
import com.kenny.recipe.entities.data.Recipes
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GetRecipesUseCase @Inject constructor(
    private val recipeRepository: RecipeRepositoryImpl
) : SingleUseCase<Unit, @JvmSuppressWildcards Recipes>() {

    override fun execute(input: Unit): Single<@JvmSuppressWildcards Recipes> {
        return recipeRepository.getRecipes()
    }
}