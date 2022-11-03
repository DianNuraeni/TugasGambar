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
    import androidx.compose.material.MaterialTheme
    import androidx.compose.material.OutlinedTextField
    import androidx.compose.material.Surface
    import androidx.compose.material.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.res.stringResource
    import androidx.compose.ui.text.font.FontStyle
    import androidx.compose.ui.text.style.TextAlign
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp

    class TugasGambar_DianNuraeni : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                BelajarAndroidTheme {
                    //A surface container using the 'background' color from the theme
                    androidx.compose.material.Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        ComposeQuadrantApp()
                    }
                }
            }
        }
    }
    @Composable
    fun ComposeQuadrantApp() {

        Column(Modifier.fillMaxWidth()) {
            Row(
               modifier = Modifier.weight(1f)
            ) {
                ComposableInfoCard(
                    title = stringResource(R.string.gununghijau),
                    description = stringResource(R.string.gununghijau_desc),
                    backgroundColor = color(0xFFe0091f),
                    modifier = Modifier.weight(1f)
                )
                ComposableInfoCard(
                    title = stringResource(R.string.hutanflorest),
                    description = stringResource(R.string.hutanflorest_desc),
                    backgroundColor = color(0xFF388518),
                    modifier = Modifier.weight(1f)
                )
                ComposableInfoCard(
                    title = stringResource(R.string.lakedanau),
                    description = stringResource(R.string.lakedanau_desc),
                    backgroundColor = color.Yellow
                            modifier = Modifier . weight (1f)
                )
            }

            Row(
                modifier = Modifier.weight(1f)
            ){
                ComposableInfoCard(
                    title = stringResource(R.string.lakedanau),
                    description = stringResource(R.string.lakedanau_desc),
                    backgroundColor = color.Yellow
                            modifier = Modifier . weight (1f)
                )
            }

                {
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
                    )
                    {
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