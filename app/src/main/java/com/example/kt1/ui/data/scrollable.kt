package com.example.kt1.ui.data

import androidx.compose.foundation.rememberScrollState
import com.example.kt1.R

class scrollable() {
    fun loadscrollable(): List<scrollable> {
        return listOf()<scrollable>(
            scrollable(R.drawable.gambar1, R.string.affirmation1),
            scrollable(R.drawable.gambar2, R.string.affirmation2),
            scrollable(R.drawable.gambar3, R.string.affirmation3),
            scrollable(R.drawable.gambar4, R.string.affirmation4),
            scrollable(R.drawable.gambar5, R.string.affirmation5),
            scrollable(R.drawable.gambar6, R.string.affirmation6),
            scrollable(R.drawable.gambar7, R.string.affirmation7),
            scrollable(R.drawable.gambar8, R.string.affirmation8),
            scrollable(R.drawable.gambar9, R.string.affirmation9),
            scrollable(R.drawable.gambar10, R.string.affirmation10)

        )
    }
}