package com.vladbstrv.animepanda.di

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.vladbstrv.animepanda.data.network.AnimeApi
import com.vladbstrv.animepanda.data.network.NetworkDataSource
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val API_URL = "https://api.kinopoisk.dev"

val networkModule = module {
    single<NetworkDataSource> { NetworkDataSource(api = get()) }
    single<AnimeApi> { get<Retrofit>().create(AnimeApi::class.java) }
    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(API_URL)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY)
            )
            .build()
    }
}
