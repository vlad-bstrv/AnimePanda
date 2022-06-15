package com.vladbstrv.animepanda

import android.app.Application
import com.vladbstrv.animepanda.di.networkModule
import com.vladbstrv.animepanda.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@App)
            modules(networkModule, viewModelModule)
        }
    }
}