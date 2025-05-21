package com.example.arcademiner.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.arcademiner.data.local.entity.FavouriteGame
import kotlinx.coroutines.flow.Flow

@Dao
interface FavouriteGameDao {

    @Query("SELECT * FROM favourite_game_list")
    suspend fun getAll(): Flow<List<FavouriteGame>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun add(games: FavouriteGame)

    @Delete
    suspend fun deleteAll(game : FavouriteGame)

}