package com.example.arcademiner.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.arcademiner.data.local.entity.GameEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface GameDao {

    @Query("SELECT * FROM game_list")
    suspend fun getAll(): Flow<List<GameEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAll(games: List<GameEntity>)

    @Query("DELETE FROM game_list")
    suspend fun deleteAll()


    @Transaction
    suspend fun deleteAllAndAddAll(games: List<GameEntity>){
        deleteAll()
        addAll(games)
    }
}