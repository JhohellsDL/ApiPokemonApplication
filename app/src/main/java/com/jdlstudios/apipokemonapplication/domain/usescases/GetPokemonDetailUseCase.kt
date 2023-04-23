package com.jdlstudios.apipokemonapplication.domain.usescases

import com.jdlstudios.apipokemonapplication.domain.models.PokemonItem
import com.jdlstudios.apipokemonapplication.domain.repositories.PokemonRepository
import javax.inject.Inject

class GetPokemonDetailUseCase @Inject constructor(
    private val repository: PokemonRepository
) {
    suspend operator fun invoke(id: Int): PokemonItem{
        return repository.getPokemonDetail(id)
    }
}