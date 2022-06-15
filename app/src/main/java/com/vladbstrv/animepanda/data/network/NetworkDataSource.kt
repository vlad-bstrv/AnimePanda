package com.vladbstrv.animepanda.data.network

import com.vladbstrv.animepanda.data.network.mapper.Mapper
import com.vladbstrv.animepanda.domain.entity.AnimeEntity
import com.vladbstrv.animepanda.domain.entity.AnimeMoreEntity

class NetworkDataSource(private val api: AnimeApi) {

    suspend fun getAnimeByName(name: String): List<AnimeEntity> {
        return Mapper().mapAnimeDtoToAnimeEntity(api.getAnimeByNameAsync(searchName = name).await())
    }

    suspend fun getAnimeById(id: String): AnimeMoreEntity {
        return Mapper().mapAnimeDtoToAnimeMoreEntity(api.getAnimeByIdAsync(searchId =  id).await())
    }
}