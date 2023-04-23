package com.jdlstudios.apipokemonapplication.domain.models

import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonCacheEntity
import com.jdlstudios.apipokemonapplication.data.repositories.models.Pokemon

data class PokemonItem(
    val id: Int,
    val name: String,
    val height: Int,
    val weight: Int
)

fun PokemonCacheEntity.toDomain() = PokemonItem(id, name, height, weight)
fun Pokemon.toDomain() = PokemonItem(id, name, height, weight)