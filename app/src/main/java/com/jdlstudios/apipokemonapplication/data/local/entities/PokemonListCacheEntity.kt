package com.jdlstudios.apipokemonapplication.data.local.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.jdlstudios.apipokemonapplication.data.local.converters.PokemonListConverter
import com.jdlstudios.apipokemonapplication.data.repositories.models.Pokemon

@Entity(tableName = "pokemon_list")
data class PokemonListCacheEntity(
    @PrimaryKey val id: Int,
    val count: Int,
    val previous: String?,
    val next: String?,
    @TypeConverters()
    val results: List<Pokemon> = mutableListOf()
)