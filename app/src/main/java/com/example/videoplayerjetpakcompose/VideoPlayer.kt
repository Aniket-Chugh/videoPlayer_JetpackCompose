package com.example.videoplayerjetpakcompose

import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun VideossPlayer(
    VideoUri : Uri
) {
    AndroidView(modifier = Modifier.fillMaxWidth().padding(12.dp).height(320.dp).clip(
        RoundedCornerShape(12.dp)
    ), factory = { context ->

        VideoView(context).apply {
            setVideoURI(VideoUri)





            val mediaController = MediaController(context)
            mediaController.setAnchorView(this)


            setMediaController(mediaController)

            setOnPreparedListener {
                start()
            }
        }

    } )
}