package com.jdlstudios.apipokemonapplication.data.api

import com.jdlstudios.apipokemonapplication.data.api.models.PokemonApiEntity
import com.jdlstudios.apipokemonapplication.data.api.models.PokemonListApiResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): PokemonListApiResponse

    @GET("pokemon/{name}")
    suspend fun getPokemonDetail(@Path("name") name: String): PokemonApiEntity
}