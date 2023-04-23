package com.jdlstudios.apipokemonapplication.data.api.models

import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonCacheEntity

data class PokemonApiEntity(
    val id: Int,
    val name: String,
    val height: Int,
    val weight: Int
)

fun PokemonApiEntity.toCache(): PokemonCacheEntity {
    return PokemonCacheEntity(id, name, height, weight)
}

