package com.dh.cookbookapp.domain.usecase

import com.dh.cookbookapp.domain.repository.RecipeRepository

class GetAllRecipesUseCase constructor(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke() = repository.getAll()

}