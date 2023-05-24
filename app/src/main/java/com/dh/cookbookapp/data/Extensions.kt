package com.dh.cookbookapp.data

import android.content.Context
import androidx.room.Room

val Context.db: AppDataBase
    get() = Room.databaseBuilder(
        applicationContext, AppDataBase::class.java, "database-recipe"
    ).build()
