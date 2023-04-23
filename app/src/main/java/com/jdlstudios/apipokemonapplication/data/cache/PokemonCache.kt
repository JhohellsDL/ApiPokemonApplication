package com.jdlstudios.apipokemonapplication.data.cache

import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonCacheEntity
import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonListCacheEntity

interface PokemonCache {
    suspend fun getPokemonList(): PokemonListCacheEntity?
    suspend fun savePokemonList(pokemonList: PokemonListCacheEntity)
    suspend fun getPokemon(pokemonId: Int): PokemonCacheEntity?
    suspend fun savePokemon(pokemon: PokemonCacheEntity)
}
