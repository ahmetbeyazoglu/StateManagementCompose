package com.herpestes.statemanagmentcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
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
fun MainScreen() {
   Surface(color = Color.LightGray) {
       Column(modifier = Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally
       ) {
           Text(text = "Hello!")
           
           Spacer(modifier = Modifier.padding(7.dp))

           Image(bitmap = ImageBitmap.imageResource(id = R.drawable.kenny),
           contentDescription = "Kenny")
           
           Spacer(modifier = Modifier.padding(7.dp))

            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription = null )

           Spacer(modifier = Modifier.padding(7.dp))

           Image(painter = ColorPainter(Color.Black), contentDescription = null)

           /*
           Button(onClick = {
               println("Clicked")
           }) {
               Text(text = "button")
               Text(text = "Test")

           }*/

       }
   }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}


