package com.jdlstudios.apipokemonapplication.di.modules

import com.jdlstudios.apipokemonapplication.data.api.PokemonApi
import com.jdlstudios.apipokemonapplication.data.cache.PokemonCache
import com.jdlstudios.apipokemonapplication.domain.repositories.PokemonRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun providePokemonRepository(
        pokemonCache: PokemonCache,
        pokemonApi: PokemonApi
    ): PokemonRepositoryImpl {
        return PokemonRepositoryImpl(pokemonCache, pokemonApi)
    }
}
