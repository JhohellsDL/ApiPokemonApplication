package com.jdlstudios.apipokemonapplication.data.repositories

import com.jdlstudios.apipokemonapplication.data.repositories.models.Pokemon
import com.jdlstudios.apipokemonapplication.data.repositories.models.PokemonList

interface PokemonRepository {
    suspend fun getPokemonList(): Result<PokemonList>
    suspend fun getPokemonById(id: Int): Result<Pokemon>
}
