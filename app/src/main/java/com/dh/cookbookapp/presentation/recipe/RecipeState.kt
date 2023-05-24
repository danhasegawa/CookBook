package com.dh.cookbookapp.presentation.recipe

import com.dh.cookbookapp.data.repository.model.RecipeDomain

sealed interface RecipeState {
    object Loading : RecipeState
    object Empty : RecipeState
    data class Success(val recipe: List<RecipeDomain>) : RecipeState
    data class Error(val message: String) : RecipeState
}