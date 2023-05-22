package com.dh.cookbookapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dh.cookbookapp.data.dao.RecipeDao
import com.dh.cookbookapp.data.entity.RecipeEntity

@Database(entities = [RecipeEntity::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao

}