package com.dh.cookbookapp.data.mapper

import com.dh.cookbookapp.data.entity.RecipeEntity
import com.dh.cookbookapp.domain.model.RecipeDomain

fun RecipeDomain.toEntity() = RecipeEntity(
    id = id,
    name = name,
    prepareTime = prepareTime
)

fun RecipeEntity.toDomain() = RecipeDomain(
    id = id,
    name = name,
    prepareTime = prepareTime
)
