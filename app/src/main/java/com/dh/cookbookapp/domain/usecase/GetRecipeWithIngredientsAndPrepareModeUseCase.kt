package com.dh.cookbookapp.domain.usecase

import com.dh.cookbookapp.domain.repository.RecipeRepository

class GetRecipeWithIngredientsAndPrepareModeUseCase constructor(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke(idRecipe: Int) =
        repository.getRecipeWithIngredientsAndPrepareMode(idRecipe)
}
