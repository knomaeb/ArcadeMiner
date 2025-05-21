package com.example.arcademiner.data.remote.response

import kotlinx.serialization.Serializable

@Serializable
data class Screenshot(
    val id: Int,
    val image: String
)