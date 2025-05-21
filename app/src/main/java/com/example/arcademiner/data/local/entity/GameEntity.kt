package com.example.arcademiner.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.arcademiner.data.model.GameContract
import com.example.arcademiner.domain.model.Games
import kotlin.String

@Entity(tableName = "game_list")
data class GameEntity(
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

fun GameEntity.toGame(): Games {
    return Games(
        title = title,
        thumbnail = thumbnail,
        short_description = short_description,
        game_url = game_url,
        genre = genre,
        platform = platform,
        publisher = publisher,
        developer = developer,
        release_date = release_date,
        freetogame_profile_url = freetogame_profile_url,
    )
}

fun Games.toEntity() : GameEntity{
    return GameEntity(
        title = title,
        thumbnail = thumbnail,
        short_description = short_description,
        game_url = game_url,
        genre = genre,
        platform = platform,
        publisher = publisher,
        developer = developer,
        release_date = release_date,
        freetogame_profile_url = freetogame_profile_url,
    )
}