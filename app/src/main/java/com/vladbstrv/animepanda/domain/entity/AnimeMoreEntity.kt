package com.vladbstrv.animepanda.domain.entity

data class AnimeMoreEntity(
    val name: String,
    val rating: RatingEntity,
    val posterUrl: String,
    val description: String,
    val year: Int,
    val genres: List<String>,
    val countries: List<String>,
    val season: List<SeasonInfoEntity>,
    val persons: List<PersonEntity>,
    val movieLength: Int,
    val sequelsAndPrequels: List<SequelsAndPrequelsEntity>,
)
