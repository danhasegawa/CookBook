package com.dh.cookbookapp.domain.usecase

import com.dh.cookbookapp.domain.model.PrepareModeDomain
import com.dh.cookbookapp.domain.repository.RecipeRepository

class UpdatePrepareModeUseCase constructor(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke(prepareMode: PrepareModeDomain) =
        repository.updatePrepareMode(prepareMode)
}