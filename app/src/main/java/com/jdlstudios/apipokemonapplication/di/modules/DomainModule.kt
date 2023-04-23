package com.jdlstudios.apipokemonapplication.di.modules

import com.jdlstudios.apipokemonapplication.domain.repositories.PokemonRepository
import com.jdlstudios.apipokemonapplication.domain.repositories.PokemonRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {
    @Provides
    fun providePokemonRepository(pokemonRepositoryImpl: PokemonRepositoryImpl): PokemonRepository {
        return pokemonRepositoryImpl
    }
}