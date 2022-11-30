package com.kenny.recipe.domain.usecases

import com.kenny.recipe.domain.repositories.RecipeRepositoryImpl
import com.kenny.recipe.entities.data.Recipe
import com.kenny.recipe.interfaces.SingleUseCase
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GetRecipesUseCase @Inject constructor(
    private val recipeRepository: RecipeRepositoryImpl
) : SingleUseCase<Unit, List<@JvmSuppressWildcards Recipe>>() {

    override fun execute(input: Unit): Single<List<Recipe>> {
        return recipeRepository.getRecipes()
    }
}