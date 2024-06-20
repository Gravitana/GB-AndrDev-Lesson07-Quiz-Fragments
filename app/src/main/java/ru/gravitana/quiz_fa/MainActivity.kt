package ru.gravitana.quiz_fa

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gravitana.quiz_fa.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.welcomeButton.text = getString(R.string.continue_button_text)

//        binding.welcome.text = buildString {
//            append(getString(R.string.app_name))
//            append(" ")
//            append(getString(R.string.app_version))
//        }

        val mp: MediaPlayer = MediaPlayer.create(this, R.raw.right_answer)
        mp.isLooping = false
        mp.setOnPreparedListener(MediaPlayer::start)
        mp.setOnCompletionListener(MediaPlayer::release)
    }
}