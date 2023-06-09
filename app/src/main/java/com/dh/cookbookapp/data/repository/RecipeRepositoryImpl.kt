package com.dh.cookbookapp.data.repository

import com.dh.cookbookapp.data.dao.RecipeDao
import com.dh.cookbookapp.data.entity.Ingredient
import com.dh.cookbookapp.data.mapper.toDomain
import com.dh.cookbookapp.data.mapper.toEntity
import com.dh.cookbookapp.domain.model.FullRecipeDomain
import com.dh.cookbookapp.domain.model.IngredientDomain
import com.dh.cookbookapp.domain.model.PrepareModeDomain
import com.dh.cookbookapp.domain.model.RecipeDomain
import com.dh.cookbookapp.domain.repository.RecipeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class RecipeRepositoryImpl(private val dao: RecipeDao) : RecipeRepository {
    override suspend fun getAll(): Flow<List<RecipeDomain>> = withContext(Dispatchers.IO) {
        dao.getAll().map { list ->
            list.map { it.toDomain() }
        }
    }

    override suspend fun insert(recipe: RecipeDomain) = withContext(Dispatchers.IO) {
        dao.insert(recipe.toEntity())
    }

    override suspend fun getRecipeWithIngredientsAndPrepareMode(idRecipe: Int): FullRecipeDomain =
        withContext(Dispatchers.IO) {
            dao.getRecipeWithIngredientsAndPrepareMode(idRecipe).toDomain()
        }

    override suspend fun insertIngredient(ingredient: IngredientDomain) =
        withContext(Dispatchers.IO) {
            dao.insert(
                Ingredient(
                    id = ingredient.id,
                    name = ingredient.name,
                    idRecipe = ingredient.idRecipe
                )
            )
        }

    override suspend fun insertPrepareMode(prepareMode: PrepareModeDomain) =
        withContext(Dispatchers.IO) {
            dao.insert(prepareMode.toEntity())
        }

    override suspend fun updateIngredient(ingredient: IngredientDomain) =
        withContext(Dispatchers.IO) {
            dao.updateIngredient(ingredient.toEntity())
        }

    override suspend fun updatePrepareMode(prepareMode: PrepareModeDomain) =
        withContext(Dispatchers.IO) {
            dao.updatePrepareMode(prepareMode.toEntity())
        }
}
