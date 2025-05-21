package com.example.arcademiner.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Games (
    val title: String,
    val thumbnail: String,
    val short_description: String,
    val game_url: String,
    val genre: String,
    val platform: String,
    val publisher: String,
    val developer: String,
    val release_date: String,
    val freetogame_profile_url: String
)