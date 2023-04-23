package com.jdlstudios.apipokemonapplication.data.cache

import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonCacheEntity
import com.jdlstudios.apipokemonapplication.data.local.dao.PokemonDao
import com.jdlstudios.apipokemonapplication.data.local.dao.PokemonListDao
import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonListCacheEntity

class PokemonCacheImpl(
    private val pokemonDao: PokemonDao,
    private val pokemonListDao: PokemonListDao
) : PokemonCache {
    override suspend fun getPokemonList(): PokemonListCacheEntity? {
        return pokemonListDao.get()
    }

    override suspend fun savePokemonList(pokemonList: PokemonListCacheEntity) {
        pokemonListDao.insert(pokemonList)
    }

    override suspend fun getPokemon(pokemonId: Int): PokemonCacheEntity? {
        return pokemonDao.getById(pokemonId)
    }

    override suspend fun savePokemon(pokemon: PokemonCacheEntity) {
        pokemonDao.insert(pokemon)
    }

}



