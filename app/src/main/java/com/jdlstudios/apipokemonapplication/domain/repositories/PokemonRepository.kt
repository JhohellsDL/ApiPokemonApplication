package com.jdlstudios.apipokemonapplication.domain.repositories

import com.jdlstudios.apipokemonapplication.domain.models.PokemonItem
import com.jdlstudios.apipokemonapplication.domain.models.PokemonListItem

interface PokemonRepository {
    suspend fun getPokemonList(): PokemonListItem
    suspend fun getPokemonDetail(id: Int): PokemonItem
}
