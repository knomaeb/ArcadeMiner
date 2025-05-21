package com.example.arcademiner.data.remote.response

import kotlinx.serialization.Serializable

@Serializable
data class MinimumSystemRequirements(
    val graphics: String,
    val memory: String,
    val os: String,
    val processor: String,
    val storage: String
)