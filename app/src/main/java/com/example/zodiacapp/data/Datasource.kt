package com.example.zodiacapp.data
import com.example.zodiacapp.R
import com.example.zodiacapp.model.zodiac
class Datasource {
    fun loadZodiac(): List<zodiac> {
        return listOf<zodiac>(
            zodiac(R.string.Zodiac1),
            zodiac(R.string.Zodiac2),
            zodiac(R.string.Zodiac3),
            zodiac(R.string.Zodiac4),
            zodiac(R.string.Zodiac5),
            zodiac(R.string.Zodiac6),
            zodiac(R.string.Zodiac7),
            zodiac(R.string.Zodiac8),
            zodiac(R.string.Zodiac9),
            zodiac(R.string.Zodiac10),
            zodiac(R.string.Zodiac11),
            zodiac(R.string.Zodiac12),
                )
    }
}