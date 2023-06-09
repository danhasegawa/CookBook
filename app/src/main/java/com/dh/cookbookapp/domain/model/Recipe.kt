package com.dh.cookbookapp.domain.model

typealias RecipeDomain = Recipe

data class Recipe(
    val id: Int = 0,
    val name: String,
    val prepareTime: String,
)
