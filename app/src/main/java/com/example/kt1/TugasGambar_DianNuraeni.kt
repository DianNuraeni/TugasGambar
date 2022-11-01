package com.example.kt1

// Tanggal : 25 Oktober 2022
// Nama    : Dian  Nuraeni (191344009)
// Kelas   : 4-TNK

    import android.content.res.Resources
    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.background
    import androidx.compose.foundation.layout.*
    import androidx.compose.material.OutlinedTextField
    import androidx.compose.material.Surface
    import androidx.compose.material.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.text.font.FontStyle
    import androidx.compose.ui.text.style.TextAlign
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp

    class TugasGambar_DianNuraeni : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                showLogoClub()
            }
        }
    }

    fun getScreenWidth(): Int {
        return Resources.getSystem().displayMetrics.widthPixels
    }

    fun getScreenHeight(): Int {
        return Resources.getSystem().displayMetrics.heightPixels
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun showLogoClub() {
        val surfaceWidth = getScreenWidth() * 0.12681;
        val surfaceHeight = getScreenHeight() * 0.1905;
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Surface(
                    color = Color(0xff2596be),
                    modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.gunung),
                            contentDescription = "gununghijau",
                            alignment = Alignment.Center,
                            modifier = Modifier.padding(16.dp)
                        )
                        Text(
                            text = "gunung",
                            fontSize = 16.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "hijau",
                            fontSize = 14.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Surface(
                    color = Color(0xff2596be),
                    modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.hutan),
                            contentDescription = "hutanflorest",
                            alignment = Alignment.Center,
                            modifier = Modifier.padding(16.dp)
                        )
                        Text(
                            text = "hutan",
                            fontSize = 16.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "florest",
                            fontSize = 14.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Surface(
                    color = Color(0xff2596be),
                    modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.danau),
                            contentDescription = "Lakedanau",
                            alignment = Alignment.Center,
                            modifier = Modifier.padding(16.dp)
                        )
                        Text(
                            text = "lake",
                            fontSize = 16.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "danau",
                            fontSize = 14.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    color = Color(0xff2596be),
                    modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lembah),
                            contentDescription = "lembahDalam",
                            alignment = Alignment.Center,
                            modifier = Modifier.padding(16.dp)
                        )
                        Text(
                            text = "lembah",
                            fontSize = 16.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "Dalam",
                            fontSize = 14.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Surface(
                    color = Color(0xff2596be),
                    modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ungai),
                            contentDescription = "ungaiNgalir",
                            alignment = Alignment.Center,
                            modifier = Modifier.padding(16.dp)
                        )
                        Text(
                            text = "ungai",
                            fontSize = 16.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "ngalir",
                            fontSize = 14.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Surface(
                    color = Color(0xff2596be),
                    modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.air_terjun),
                            contentDescription = "Air_terjun",
                            alignment = Alignment.Center,
                            modifier = Modifier.padding(16.dp)
                        )
                        Text(
                            text = "air",
                            fontSize = 16.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "terjun",
                            fontSize = 14.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
}