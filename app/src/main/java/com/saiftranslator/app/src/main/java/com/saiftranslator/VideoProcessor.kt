package com.saiftranslator

object VideoProcessor {
    fun extractAudio(videoPath: String): String {
        return videoPath.replace(".mp4", ".mp3")
    }

    fun burnSubtitles(videoPath: String, srtPath: String): String {
        return videoPath.replace(".mp4", "_subtitled.mp4")
    }
}
