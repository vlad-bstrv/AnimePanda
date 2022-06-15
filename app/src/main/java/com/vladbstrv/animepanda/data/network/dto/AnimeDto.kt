package com.vladbstrv.animepanda.data.network.dto

data class AnimeDto (
    val ageRating: Int,
    val countries: List<Country>,
    val createDate: String,
    val description: String,
    val enName: String,
    val genres: List<Genre>,
    val id: Int,
    val movieLength: Int,
    val name: String,
    val persons: List<Person>,
    val poster: Poster,
    val premiere: Premiere,
    val rating: Rating,
    val ratingMpaa: String,
    val seasonsInfo: List<SeasonsInfo>,
    val sequelsAndPrequels: List<SequelsAndPrequel>,
    val year: Int
)

data class Country(
    val name: String
)

data class Genre(
    val name: String
)

data class Person(
    val description: String,
    val enName: String,
    val enProfession: String,
    val id: Int,
    val name: String,
    val photo: String
)

data class Premiere(
    val _id: String,
    val country: String,
    val world: String
)

data class SeasonsInfo(
    val episodesCount: Int,
    val number: Int
)

data class SequelsAndPrequel(
    val _id: String,
    val alternativeName: String,
    val enName: String,
    val id: Int,
    val name: String,
    val poster: Poster,
    val type: String
)