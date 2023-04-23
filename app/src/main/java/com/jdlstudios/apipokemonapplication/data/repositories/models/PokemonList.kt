package com.jdlstudios.apipokemonapplication.data.repositories.models

data class PokemonList(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Pokemon>
)
