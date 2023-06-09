package com.dh.cookbookapp.domain.usecase

import com.dh.cookbookapp.domain.model.IngredientDomain
import com.dh.cookbookapp.domain.repository.RecipeRepository

class InsertIngredientsUseCase constructor(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke(ingredientDomain: IngredientDomain) =
        repository.insertIngredient(ingredientDomain)
}