package com.example.kt1.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kt1.R
import com.example.kt1.ui.data.scrollable

class scrollableActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            ScrollableApp(listScrollable = ListScrollable().loadScrollaable())
            ScrollableCardPreview()
        }
    }
}
@Composable
fun ScrollableApp(listscrollable: List<scrollable>){
    Column() {
        listscrollable.forEach{scrollable ->
            ScrollableCard(scrollable)
        }

    }
}

@Composable
fun ScrollableCard(scrollable: scrollable){
    Card(
        elevation = 8.dp
        modifier = Modifier.padding(8.dp)
            ) {
        Column() {
            Image(
                painter = painterResource(id = scrollable.imageResourceId),
                contentDescription = stringResource(
                    id = R.string.affirmation1
                ),
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = scrollable.textResourceId),
                modifier = Modifier.modifierLocalConsumer { }.padding(8.dp),
                style = MaterialTheme.Typography.h6
            )
        }
    }

}
@Preview(showBackground = true)
@Composable
fun ScrollableCardPreview(){
    ScrollableApp(listscrollable = listscrollable().loadScrollable())
}