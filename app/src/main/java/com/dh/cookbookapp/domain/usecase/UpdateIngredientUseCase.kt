package com.dh.cookbookapp.domain.usecase

import com.dh.cookbookapp.domain.model.IngredientDomain
import com.dh.cookbookapp.domain.repository.RecipeRepository

class UpdateIngredientUseCase constructor(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke(ingredient: IngredientDomain) =
        repository.updateIngredient(ingredient)
}