package com.jdlstudios.apipokemonapplication.data.repositories.models

import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonCacheEntity

data class Pokemon(
    val id: Int,
    val name: String,
    val height: Int,
    val weight: Int
)

