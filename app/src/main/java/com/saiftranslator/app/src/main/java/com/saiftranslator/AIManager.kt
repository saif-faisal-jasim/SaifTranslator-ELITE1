package com.saiftranslator

object AIManager {
    fun transcribeAudio(audioPath: String): String {
        return "Transcribed text from $audioPath"
    }

    fun translateText(text: String, targetLang: String): String {
        return "Translated ($targetLang): $text"
    }
}
