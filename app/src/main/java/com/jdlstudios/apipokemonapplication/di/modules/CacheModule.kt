package com.jdlstudios.apipokemonapplication.di.modules

import android.content.Context
import androidx.room.Room
import com.jdlstudios.apipokemonapplication.data.cache.PokemonCache
import com.jdlstudios.apipokemonapplication.data.cache.PokemonCacheImpl
import com.jdlstudios.apipokemonapplication.data.local.PokemonDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CacheModule {
    private const val DATABASE_NAME = "pokemon_db"

    @Provides
    @Singleton
    fun providePokemonDatabase(@ApplicationContext context: Context): PokemonDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            PokemonDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Provides
    fun providePokemonCache(database: PokemonDatabase): PokemonCache {
        return PokemonCacheImpl(database.pokemonDao(), database.pokemonListDao())
    }
}
