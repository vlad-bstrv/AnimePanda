package com.vladbstrv.animepanda.data.network.mapper

import com.vladbstrv.animepanda.data.network.dto.AnimeDto
import com.vladbstrv.animepanda.data.network.dto.AnimeListDto
import com.vladbstrv.animepanda.domain.entity.*

class Mapper {
    fun mapAnimeDtoToAnimeEntity(animeListDto: AnimeListDto): List<AnimeEntity> {
        val list: MutableList<AnimeEntity> = mutableListOf()

        for (anime in animeListDto.docs) {
            list.add(
                AnimeEntity(
                    name = anime.name,
                    rating = RatingEntity(anime.rating.kp, anime.rating.imdb),
                    posterUrl = anime.poster.previewUrl,
                    description = anime.shortDescription ?: "отсут",
                    year = anime.year,
                )
            )
        }
        return list
    }

    fun mapAnimeDtoToAnimeMoreEntity(animeDto: AnimeDto) =
        AnimeMoreEntity(
            name = animeDto.name,
            rating = mapRatingDtoToRatingEntity(animeDto),
            posterUrl = animeDto.poster.url,
            description = animeDto.description,
            year = animeDto.year,
            genres = mapListGenresToString(animeDto),
            countries = mapListCountriesToString(animeDto),
            movieLength = animeDto.movieLength,
            season = mapSeasonDtoToSeasonEntity(animeDto),
            persons = mapPersonDtoToPersonEntity(animeDto),
            sequelsAndPrequels = mapSequelsAndPrequelsDtoToSequelsAndPrequelsEntity(animeDto)
        )

    private fun mapSequelsAndPrequelsDtoToSequelsAndPrequelsEntity(animeDto: AnimeDto): List<SequelsAndPrequelsEntity> {
        val list: MutableList<SequelsAndPrequelsEntity> = mutableListOf()
        for (sequelsAndPrequels in animeDto.sequelsAndPrequels)
            list.add(SequelsAndPrequelsEntity(
                name = sequelsAndPrequels.name,
                type = sequelsAndPrequels.type,
                posterUrl = sequelsAndPrequels.poster.url))
        return list
    }

    private fun mapSeasonDtoToSeasonEntity(animeDto: AnimeDto): List<SeasonInfoEntity> {
        val list: MutableList<SeasonInfoEntity> = mutableListOf()
        for (season in animeDto.seasonsInfo)
            list.add(SeasonInfoEntity(season.episodesCount, season.number))
        return list
    }


    private fun mapListCountriesToString(animeDto: AnimeDto): List<String> {
        val list: MutableList<String> = mutableListOf()
        for (countries in animeDto.countries)
            list.add(countries.name)
        return list
    }

    private fun mapListGenresToString(animeDto: AnimeDto): List<String> {
        val list: MutableList<String> = mutableListOf()
        for (countries in animeDto.genres)
            list.add(countries.name)
        return list
    }

    private fun mapPersonDtoToPersonEntity(animeDto: AnimeDto): List<PersonEntity> {
        val list: MutableList<PersonEntity> = mutableListOf()
        for (person in animeDto.persons) {
            list.add(
                PersonEntity(
                    description = person.description,
                    enName = person.enName,
                    enProfession = person.enProfession,
                    id = person.id,
                    name = person.name,
                    photo = person.photo
                )
            )
        }
        return list
    }

    private fun mapRatingDtoToRatingEntity(animeDto: AnimeDto) =
        RatingEntity(animeDto.rating.kp, animeDto.rating.imdb)
}

