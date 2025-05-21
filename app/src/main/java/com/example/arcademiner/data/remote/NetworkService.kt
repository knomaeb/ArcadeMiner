package com.example.arcademiner.data.remote

import com.example.arcademiner.data.remote.response.GameResponse
import com.example.arcademiner.data.remote.response.GamesDto
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface NetworkService {

    @GET("games")
    suspend fun getGames() : GamesDto

    @GET("games")
    suspend fun getGamesByPlatform(
        @Query("platform") platform: String
    ) : GamesDto

    @GET("games")
    suspend fun getGamesByGenre(
        @Query("genre") genre: String,
        @Query("platform") platform: String
    ) : GamesDto

    @GET("games?{gameId}")
    suspend fun getGameDetails(
        @Query("id") gameId: Int
    ) : GameResponse

}