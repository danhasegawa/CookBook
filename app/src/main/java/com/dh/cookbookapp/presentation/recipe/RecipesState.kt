package com.dh.cookbookapp.presentation.recipe

import com.dh.cookbookapp.domain.model.RecipeDomain

sealed interface RecipesState {
    object Loading : RecipesState
    object Empty : RecipesState
    data class Success(val recipes: List<RecipeDomain>) : RecipesState
    data class Error(val message: String) : RecipesState
}
