package com.saiftranslator

object TTSManager {
    fun generateVoice(text: String, lang: String): String {
        return "voice_$lang.mp3"
    }
}
