package com.jdlstudios.apipokemonapplication.domain.repositories

import com.jdlstudios.apipokemonapplication.data.api.PokemonApi
import com.jdlstudios.apipokemonapplication.data.api.models.toCache
import com.jdlstudios.apipokemonapplication.data.cache.PokemonCache
import com.jdlstudios.apipokemonapplication.domain.models.PokemonItem
import com.jdlstudios.apipokemonapplication.domain.models.PokemonListItem
import com.jdlstudios.apipokemonapplication.domain.models.toDomain

class PokemonRepositoryImpl(
    private val pokemonCache: PokemonCache,
    private val pokemonApi: PokemonApi
) : PokemonRepository {

    override suspend fun getPokemonList(): PokemonListItem {
        val cachedPokemonList = pokemonCache.getPokemonList()
        if (cachedPokemonList != null) {
            return cachedPokemonList.toDomain()
        }

        val apiResponse = pokemonApi.getPokemonList()
        val pokemonList = apiResponse.toCache()
        pokemonCache.savePokemonList(pokemonList)
        return pokemonList.toDomain()
    }

    override suspend fun getPokemonDetail(id: Int): PokemonItem {
        val cachedPokemon = pokemonCache.getPokemon(id)
        if (cachedPokemon != null) {
            return cachedPokemon.toDomain()
        }

        val apiResponse = pokemonApi.getPokemonDetail(id)
        val pokemon = apiResponse.toCache()
        pokemonCache.savePokemon(pokemon = pokemon)
        return pokemon.toDomain()
    }
}
