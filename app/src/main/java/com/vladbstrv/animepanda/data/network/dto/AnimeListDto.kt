package com.vladbstrv.animepanda.data.network.dto

import com.google.gson.annotations.SerializedName

data class AnimeListDto(
    @SerializedName("docs")
    val docs: List<Docs>
)

data class Docs(

    @SerializedName("poster") val poster : Poster,
    @SerializedName("rating") val rating : Rating,
    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String,
    @SerializedName("year") val year : Int,
    @SerializedName("shortDescription") val shortDescription : String?,
)

data class Poster(
    @SerializedName("url") val url : String,
    @SerializedName("previewUrl") val previewUrl : String
)

data class Rating(
    @SerializedName("kp") val kp : Double,
    @SerializedName("imdb") val imdb : Double
)

