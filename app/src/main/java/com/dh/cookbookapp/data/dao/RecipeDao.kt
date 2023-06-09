package com.dh.cookbookapp.data.dao


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.dh.cookbookapp.data.entity.FullRecipeEntity
import com.dh.cookbookapp.data.entity.Ingredient
import com.dh.cookbookapp.data.entity.PrepareMode
import com.dh.cookbookapp.data.entity.Recipe
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipe")
    fun getAll(): Flow<List<Recipe>>

    @Insert
    fun insert(recipe: Recipe)

    @Insert
    fun insert(ingredient: Ingredient)

    @Insert
    fun insert(prepareMode: PrepareMode)

    @Transaction
    @Query("SELECT * From recipe where id = :recipeId")
    fun getRecipeWithIngredientsAndPrepareMode(recipeId: Int): FullRecipeEntity

    @Update
    fun updateIngredient(ingredient: Ingredient)

    @Update
    fun updatePrepareMode(prepareMode: PrepareMode)
}
