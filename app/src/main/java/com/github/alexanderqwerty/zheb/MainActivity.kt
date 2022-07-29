package com.github.alexanderqwerty.zheb

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a: AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        findViewById<ImageButton>(R.id.bt_sayZheb).setOnClickListener {
            if (findViewById<Switch>(R.id.s_alwaysLoud).isChecked)
                a.setStreamVolume(
                    AudioManager.STREAM_MUSIC,
                    a.getStreamMaxVolume(AudioManager.STREAM_MUSIC),
                    0
                )
            MediaPlayer.create(this, R.raw.a).start()
        }
    }
}