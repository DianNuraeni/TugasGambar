package com.example.kt1

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val warnaUngu = Color(0xffc791c7)
        val putih = Color(color: 0xfffff0000)
        setContent {
          Column() {
                Surface(color = Color.Yellow, modifier = Modifier.fillMaxWidth()){
                    Text(
                        text = "Hallo Dian",
                        fontSize = 18.sp,
                        modifier = Modifier.padding
                    )
                }

              )
            }

        }
    }
}

