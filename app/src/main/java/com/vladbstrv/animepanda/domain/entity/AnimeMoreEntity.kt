package com.vladbstrv.animepanda.domain.entity

data class AnimeMoreEntity (
    val name: String,
    val rating: RatingEntity,
    val posterUrl: String,
    val description: String,
    val year: Int,
    val genres: List<String>,
    val countries: String,
    val season: Int,
    val persons: List<PersonEntity>,
    val productionCompanies: String,
    val movieLength: Int,
    val status: String,
    val sequelsAndPrequels: List<SequelsAndPrequelsEntity>,
        )