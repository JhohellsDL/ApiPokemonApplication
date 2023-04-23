package com.jdlstudios.apipokemonapplication.data.local.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.jdlstudios.apipokemonapplication.data.local.entities.PokemonCacheEntity

class Converters {

    @TypeConverter
    fun fromPokemonList(value: List<PokemonCacheEntity>): String {
        val type = object : TypeToken<List<PokemonCacheEntity>>() {}.type
        return Gson().toJson(value, type)
    }

    @TypeConverter
    fun toPokemonList(value: String): List<PokemonCacheEntity> {
        val type = object : TypeToken<List<PokemonCacheEntity>>() {}.type
        return Gson().fromJson(value, type)
    }

}