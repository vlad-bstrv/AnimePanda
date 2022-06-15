package com.vladbstrv.animepanda.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vladbstrv.animepanda.data.network.NetworkDataSource
import com.vladbstrv.animepanda.domain.entity.AnimeEntity
import com.vladbstrv.animepanda.domain.entity.AnimeMoreEntity
import kotlinx.coroutines.launch

class MainViewModel(private val networkDataSource: NetworkDataSource): ViewModel() {
    val anime: MutableLiveData<List<AnimeEntity>> = MutableLiveData<List<AnimeEntity>>()
    val animeMore: MutableLiveData<AnimeMoreEntity> = MutableLiveData<AnimeMoreEntity>()

    fun getAnime(name: String) {
        viewModelScope.launch {
            anime.postValue(networkDataSource.getAnimeByName(name))
        }
    }

    fun getAnimeMore(id: String) {
        viewModelScope.launch {
            animeMore.postValue(networkDataSource.getAnimeById(id))
        }
    }
}