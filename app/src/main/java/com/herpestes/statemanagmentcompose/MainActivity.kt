package com.herpestes.statemanagmentcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.herpestes.statemanagmentcompose.ui.theme.StatemanagmentcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(name: String) {
   Surface(color = Color.LightGray) {
       Column(modifier = Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally
       ) {
           Text(text = "Hello!")
           
           Spacer(modifier = Modifier.padding(7.dp))
           
           Button(onClick = {
               println("Clicked")
           }) {
               Text(text = "button")
               Text(text = "Test")

           }

       }
   }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}


