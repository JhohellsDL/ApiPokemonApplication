package com.jdlstudios.apipokemonapplication.data.local.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.jdlstudios.apipokemonapplication.data.repositories.models.Pokemon

class PokemonListConverter {
    @TypeConverter
    fun fromJson(json: String): List<Pokemon> {
        return Gson().fromJson(json, object : TypeToken<List<Pokemon>>() {}.type)
    }

    @TypeConverter
    fun toJson(pokemonList: List<Pokemon>): String {
        return Gson().toJson(pokemonList)
    }
}
