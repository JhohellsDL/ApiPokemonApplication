package com.jdlstudios.apipokemonapplication.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jdlstudios.apipokemonapplication.data.repositories.models.Pokemon

@Entity(tableName = "pokemon")
data class PokemonCacheEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val height: Int,
    val weight: Int
) {
    constructor(pokemon: Pokemon) : this(
        0,
        pokemon.name,
        pokemon.height,
        pokemon.weight
    )

    companion object {
        fun fromPokemon(pokemon: Pokemon): PokemonCacheEntity {
            return PokemonCacheEntity(
                id = pokemon.id,
                name = pokemon.name,
                height = pokemon.height,
                weight = pokemon.weight
            )
        }
    }

    fun toPokemon(): Pokemon {
        return Pokemon(
            id = id,
            name = name,
            height = height,
            weight = weight
        )
    }
}
