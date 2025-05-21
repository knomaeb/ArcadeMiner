package com.example.arcademiner.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.arcademiner.data.model.GameContract

@Entity(tableName = "favourite_game_list")
data class FavouriteGame(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int = 0,
    @ColumnInfo(name = "title")
    override val title: String,
    @ColumnInfo(name = "thumbnail")
    override val thumbnail: String,
    @ColumnInfo(name = "short_description")
    override val short_description: String,
    @ColumnInfo(name = "game_url")
    override val game_url: String,
    @ColumnInfo(name = "genre")
    override val genre: String,
    @ColumnInfo(name = "platform")
    override val platform: String,
    @ColumnInfo(name = "publisher")
    override val publisher: String,
    @ColumnInfo(name = "developer")
    override val developer: String,
    @ColumnInfo(name = "release_date")
    override val release_date: String,
    @ColumnInfo(name = "freetogame_profile_url")
    override val freetogame_profile_url: String,
) : GameContract
