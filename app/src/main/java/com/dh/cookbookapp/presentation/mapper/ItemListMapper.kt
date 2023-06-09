package com.dh.cookbookapp.presentation.mapper

import com.dh.cookbookapp.domain.model.IngredientDomain
import com.dh.cookbookapp.domain.model.PrepareModeDomain
import com.dh.cookbookapp.presentation.model.ItemListModel

fun IngredientDomain.toModel() = ItemListModel(
    id = id,
    name = name
)

fun List<IngredientDomain>.toModelIngredient() = map {
    it.toModel()
}

fun PrepareModeDomain.toModel() = ItemListModel(
    id = id,
    name = name
)

fun List<PrepareModeDomain>.toModelPrepareMode() = map {
    it.toModel()
}


