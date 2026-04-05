package com.saiftranslator

object SubtitleManager {
    fun createSRT(translatedText: String): String {
        return "1\n00:00:00,000 --> 00:00:05,000\n$translatedText\n"
    }
}
