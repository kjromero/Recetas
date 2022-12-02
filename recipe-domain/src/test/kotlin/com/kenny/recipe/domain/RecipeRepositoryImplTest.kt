package com.kenny.recipe.domain

import com.kenny.recipe.domain.repositories.RecipeRepositoryImpl
import com.kenny.recipe.domain.services.RecipeService
import com.kenny.recipe.domain.services.model.RecipeDetailResponse
import com.kenny.recipe.domain.services.model.RecipesResponse
import com.kenny.recipe.interfaces.RecipeRepository
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import io.reactivex.rxjava3.core.Single
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class RecipeRepositoryImplTest {

    private lateinit var recipeRepository: RecipeRepository

    @MockK(relaxed = true)
    private lateinit var recipeService: RecipeService

    @BeforeEach
    fun setUp() {
        recipeRepository = RecipeRepositoryImpl(recipeService)
    }

    private val recipesResponse = RecipesResponse(
        results = listOf()
    )

    private val recipeDetailResponse = RecipeDetailResponse(
        summary = "Summary from recipe",
        title = "title from recipe",
        image = "Url image from recipe"
    )

    @Test
    fun `Should call get recipes when getRecipes method is invoked`() {
        // given
        every {
            recipeService.getRecipes()
        } returns Single.just(recipesResponse)

        // when
        val result = recipeRepository.getRecipes().test()

        // then
        verify(exactly = 1) {
            recipeService.getRecipes()
        }

        result.assertComplete()
        result.assertNoErrors()
    }

    @Test
    fun `Should call get recipe detail when getRecipeDetail method is invoked`() {
        // given
        every {
            recipeService.getRecipeDetail(1)
        } returns Single.just(recipeDetailResponse)

        // when
        val result = recipeRepository.getRecipeDetail(1).test()

        // then
        verify(exactly = 1) {
            recipeService.getRecipeDetail(1)
        }

        result.assertComplete()
        result.assertNoErrors()
    }
}