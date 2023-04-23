package com.jdlstudios.apipokemonapplication.domain.models

import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonListCacheEntity
import com.jdlstudios.apipokemonapplication.data.repositories.models.PokemonList

data class PokemonListItem(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonItem>
)

fun PokemonListCacheEntity.toDomain() = PokemonListItem(count, next, previous, results.map {
    it.toDomain()
} )

fun PokemonList.toDomain() = PokemonListItem(count, next, previous, results.map {
    it.toDomain()
})