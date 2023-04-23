package com.jdlstudios.apipokemonapplication.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.jdlstudios.apipokemonapplication.data.local.converters.Converters
import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonCacheEntity
import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonListCacheEntity
import com.jdlstudios.apipokemonapplication.data.local.dao.PokemonDao
import com.jdlstudios.apipokemonapplication.data.local.dao.PokemonListDao

@TypeConverters(Converters::class)
@Database(entities = [PokemonCacheEntity::class, PokemonListCacheEntity::class], version = 1)
abstract class PokemonDatabase : RoomDatabase() {
    abstract fun pokemonDao(): PokemonDao
    abstract fun pokemonListDao(): PokemonListDao
}
