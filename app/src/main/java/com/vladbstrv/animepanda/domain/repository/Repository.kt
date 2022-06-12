package com.vladbstrv.animepanda.domain.repository

import androidx.core.app.Person
import com.vladbstrv.animepanda.domain.entity.AnimeEntity
import com.vladbstrv.animepanda.domain.entity.AnimeMoreEntity

interface Repository {
    fun getAnime(name: String): List<AnimeEntity>
    fun getAnimeById(id: Int): AnimeMoreEntity
    fun getPerson(id: Int): Person
}

//https://api.kinopoisk.dev/movie?field=name&search=дракон&field=type&search=anime&isStrict=false&token=ZQQ8GMN-TN54SGK-NB3MKEC-ZKB8V06
//https://api.kinopoisk.dev/movie?field=id&search=1381125&token=ZQQ8GMN-TN54SGK-NB3MKEC-ZKB8V06