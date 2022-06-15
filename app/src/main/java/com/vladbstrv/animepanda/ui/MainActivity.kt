package com.vladbstrv.animepanda.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vladbstrv.animepanda.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getAnime("песня")
        viewModel.getAnimeMore("6218c788651ebcb9df439883")

        viewModel.anime.observe(this) {

        }

        viewModel.animeMore.observe(this) {

        }

    }
}