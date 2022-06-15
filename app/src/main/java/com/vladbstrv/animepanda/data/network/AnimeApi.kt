package com.vladbstrv.animepanda.data.network

import com.vladbstrv.animepanda.data.network.dto.AnimeDto
import com.vladbstrv.animepanda.data.network.dto.AnimeListDto
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

private const val TOKEN = "ZQQ8GMN-TN54SGK-NB3MKEC-ZKB8V06"
interface AnimeApi {
    @GET("./movie")
    fun getAnimeByNameAsync(
        @Query("field") fieldName: String = "name",
        @Query("search") searchName: String,
        @Query("field") fieldType: String = "type",
        @Query("search") searchType: String = "anime",
        @Query("isStrict") isStrict: String = "false",
        @Query("token") token: String = TOKEN
    ): Deferred<AnimeListDto>


    @GET("./movie")
    fun getAnimeByIdAsync(
        @Query("field") fieldId: String = "id",
        @Query("search") searchId: String,
        @Query("token") token: String = TOKEN
    ): Deferred<AnimeDto>
}