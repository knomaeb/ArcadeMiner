package com.example.arcademiner.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.arcademiner.data.local.dao.FavouriteGameDao
import com.example.arcademiner.data.local.dao.GameDao
import com.example.arcademiner.data.local.entity.FavouriteGame
import com.example.arcademiner.data.local.entity.GameEntity

@Database(
    entities = [GameEntity::class, FavouriteGame::class],
    version = 1,
    exportSchema = true
)
abstract class GameDatabase : RoomDatabase() {
    abstract fun gameDao() : GameDao
    abstract fun favouriteGameDao() : FavouriteGameDao
}