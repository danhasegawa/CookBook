package com.dh.cookbookapp.domain.repository

import com.dh.cookbookapp.domain.model.RecipeDomain

interface RecipeRepository {

    suspend fun getAll(): List<RecipeDomain>
    suspend fun insert(recipe: RecipeDomain)

}