package com.dh.cookbookapp.data.mapper

import com.dh.cookbookapp.data.entity.IngredientEntity
import com.dh.cookbookapp.domain.model.IngredientDomain

fun IngredientDomain.toEntity() = IngredientEntity(
    id = id,
    name = name,
    idRecipe = idRecipe
)

fun IngredientEntity.toDomain() = IngredientDomain(
    id = id,
    name = name,
    idRecipe = idRecipe
)
