package com.jdlstudios.apipokemonapplication.data.api.models

import com.google.gson.annotations.SerializedName

data class PokemonListApiResponse(
    @SerializedName("count") val count: Int,
    @SerializedName("next") val next: String?,
    @SerializedName("previous") val previous: String?,
    @SerializedName("results") val pokemonList: List<PokemonApiEntity>
)
