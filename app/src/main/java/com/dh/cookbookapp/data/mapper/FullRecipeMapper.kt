package com.dh.cookbookapp.data.mapper

import com.dh.cookbookapp.data.entity.FullRecipeEntity
import com.dh.cookbookapp.domain.model.FullRecipeDomain
import com.dh.cookbookapp.domain.model.IngredientDomain

fun FullRecipeEntity.toDomain() = FullRecipeDomain(
    recipe = recipe.toDomain(),
    ingredients = ingredients.map {
        IngredientDomain(
            id = it.id,
            name = it.name,
            idRecipe = it.idRecipe
        )
    },
    prepareMode = prepareMode.map {
        it.toDomain()
    }
)