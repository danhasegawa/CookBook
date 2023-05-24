package com.dh.cookbookapp.data.repository

import com.dh.cookbookapp.data.dao.RecipeDao
import com.dh.cookbookapp.data.mapper.toDomain
import com.dh.cookbookapp.data.mapper.toEntity
import com.dh.cookbookapp.data.repository.model.RecipeDomain
import com.dh.cookbookapp.domain.repository.RecipeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RecipeRepositoryImpl(private val dao: RecipeDao) : RecipeRepository {

    override suspend fun getAll(): List<RecipeDomain> = withContext(Dispatchers.IO) {
        dao.getAll().map {
            it.toDomain()
        }
    }

    override suspend fun insert(recipe: RecipeDomain) = withContext(Dispatchers.IO) {
        dao.insert(recipe.toEntity())
    }
}