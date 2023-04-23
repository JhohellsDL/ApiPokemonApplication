package com.jdlstudios.apipokemonapplication.domain.usescases

import com.jdlstudios.apipokemonapplication.domain.models.PokemonListItem
import com.jdlstudios.apipokemonapplication.domain.repositories.PokemonRepository
import javax.inject.Inject

class GetPokemonListUseCase @Inject constructor(
    private val repository: PokemonRepository
) {
    suspend operator fun invoke(): PokemonListItem {
        return repository.getPokemonList()
    }
}
