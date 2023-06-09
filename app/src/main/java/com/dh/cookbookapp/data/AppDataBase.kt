package com.dh.cookbookapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dh.cookbookapp.data.dao.RecipeDao
import com.dh.cookbookapp.data.entity.Ingredient
import com.dh.cookbookapp.data.entity.PrepareMode
import com.dh.cookbookapp.data.entity.Recipe

@Database(
    entities = [
        Recipe::class,
        Ingredient::class,
        PrepareMode::class
    ], version = 2
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}