package com.jdlstudios.apipokemonapplication.di.modules

import com.jdlstudios.apipokemonapplication.domain.repositories.PokemonRepository
import com.jdlstudios.apipokemonapplication.domain.usescases.GetPokemonDetailUseCase
import com.jdlstudios.apipokemonapplication.domain.usescases.GetPokemonListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetPokemonListUseCase(repository: PokemonRepository): GetPokemonListUseCase {
        return GetPokemonListUseCase(repository)
    }

    @Provides
    fun provideGetPokemonDetailUseCase(repository: PokemonRepository): GetPokemonDetailUseCase {
        return GetPokemonDetailUseCase(repository)
    }
}
