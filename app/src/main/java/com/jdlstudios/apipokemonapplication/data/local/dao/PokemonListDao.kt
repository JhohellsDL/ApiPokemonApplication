package com.jdlstudios.apipokemonapplication.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonListCacheEntity

@Dao
interface PokemonListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pokemonList: PokemonListCacheEntity)

    @Query("SELECT * FROM pokemon_list")
    suspend fun get(): PokemonListCacheEntity?
}