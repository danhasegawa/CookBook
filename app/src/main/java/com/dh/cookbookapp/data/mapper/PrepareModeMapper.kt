package com.dh.cookbookapp.data.mapper

import com.dh.cookbookapp.data.entity.PrepareModeEntity
import com.dh.cookbookapp.domain.model.PrepareModeDomain

fun PrepareModeDomain.toEntity() = PrepareModeEntity(
    id = id,
    name = name,
    idRecipe = idRecipe
)

fun PrepareModeEntity.toDomain() = PrepareModeDomain(
    id = id,
    name = name,
    idRecipe = idRecipe
)
