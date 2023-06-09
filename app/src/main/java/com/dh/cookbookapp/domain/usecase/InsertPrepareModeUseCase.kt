package com.dh.cookbookapp.domain.usecase

import com.dh.cookbookapp.domain.model.PrepareModeDomain
import com.dh.cookbookapp.domain.repository.RecipeRepository

class InsertPrepareModeUseCase constructor(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke(prepareMode: PrepareModeDomain) =
        repository.insertPrepareMode(prepareMode)
}