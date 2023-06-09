package com.dh.cookbookapp.domain.repository

import com.dh.cookbookapp.domain.model.FullRecipeDomain
import com.dh.cookbookapp.domain.model.IngredientDomain
import com.dh.cookbookapp.domain.model.PrepareModeDomain
import com.dh.cookbookapp.domain.model.RecipeDomain
import kotlinx.coroutines.flow.Flow

interface RecipeRepository {
    suspend fun getAll(): Flow<List<RecipeDomain>>
    suspend fun insert(recipe: RecipeDomain)
    suspend fun getRecipeWithIngredientsAndPrepareMode(idRecipe: Int): FullRecipeDomain
    suspend fun insertIngredient(ingredient: IngredientDomain)
    suspend fun insertPrepareMode(prepareMode: PrepareModeDomain)
    suspend fun updateIngredient(ingredient: IngredientDomain)
    suspend fun updatePrepareMode(prepareMode: PrepareModeDomain)
}
