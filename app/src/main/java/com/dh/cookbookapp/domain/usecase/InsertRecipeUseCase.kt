package com.dh.cookbookapp.domain.usecase

import com.dh.cookbookapp.domain.model.RecipeDomain
import com.dh.cookbookapp.domain.repository.RecipeRepository

class InsertRecipeUseCase constructor(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke(recipe: RecipeDomain) = repository.insert(recipe)

}