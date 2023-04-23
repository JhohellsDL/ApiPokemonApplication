package com.jdlstudios.apipokemonapplication.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity(tableName = "pokemon_list")
data class PokemonListCacheEntity(
    @PrimaryKey val id: Int,
    val count: Int,
    val previous: String?,
    val next: String?,
    @TypeConverters()
    val results: List<PokemonCacheEntity> = mutableListOf()
)