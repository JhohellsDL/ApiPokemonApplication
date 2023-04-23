package com.jdlstudios.apipokemonapplication.data.api.models

import com.google.gson.annotations.SerializedName
import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonListCacheEntity

data class PokemonListApiResponse(
    @SerializedName("count") val count: Int,
    @SerializedName("next") val next: String?,
    @SerializedName("previous") val previous: String?,
    @SerializedName("results") val pokemonList: List<PokemonApiEntity>
)

fun PokemonListApiResponse.toCache(): PokemonListCacheEntity {
    return PokemonListCacheEntity(
        0,
        count = count,
        next = next,
        previous = previous,
        results = pokemonList.map { it.toCache() }
    )
}
