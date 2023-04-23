package com.jdlstudios.apipokemonapplication.data.local.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.jdlstudios.apipokemonapplication.data.repositories.models.Pokemon

class Converters {

    /*@TypeConverter
    fun fromJson(value: String): List<Pokemon> {
        val type = object:TypeToken<List<Pokemon>>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun toJson(list: List<Pokemon>): String {
        return Gson().toJson(list)
    }*/

    @TypeConverter
    fun fromPokemonList(value: List<Pokemon>): String {
        val type = object : TypeToken<List<Pokemon>>() {}.type
        return Gson().toJson(value, type)
    }

    @TypeConverter
    fun toPokemonList(value: String): List<Pokemon> {
        val type = object : TypeToken<List<Pokemon>>() {}.type
        return Gson().fromJson(value, type)
    }

}