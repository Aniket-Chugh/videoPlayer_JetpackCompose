package com.example.videoplayerjetpakcompose

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.videoplayerjetpakcompose.ui.theme.VideoPlayerJetpakComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VideoPlayerJetpakComposeTheme {
                val videoUri = Uri.parse("android.resource://com.example.videoplayerjetpakcompose/raw/sample")
                VideossPlayer(videoUri)
            }
        }
    }
}
