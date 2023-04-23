package com.jdlstudios.apipokemonapplication.data.api

import com.jdlstudios.apipokemonapplication.data.api.models.PokemonApiEntity
import com.jdlstudios.apipokemonapplication.data.api.models.PokemonListApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {

    @GET("pokemon")
    suspend fun getPokemonList(): PokemonListApiResponse

    @GET("pokemon/{name}")
    suspend fun getPokemonDetail(@Path("id") id: Int): PokemonApiEntity
}