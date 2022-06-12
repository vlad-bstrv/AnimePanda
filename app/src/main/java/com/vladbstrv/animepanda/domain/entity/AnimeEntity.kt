package com.vladbstrv.animepanda.domain.entity

data class AnimeEntity(
    val name: String,
    val rating: RatingEntity,
    val posterUrl: String,
    val description: String,
    val year: Int,
)

