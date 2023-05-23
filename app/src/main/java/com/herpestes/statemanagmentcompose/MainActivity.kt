package com.herpestes.statemanagmentcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.TextFieldValue
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

@SuppressLint("UnrememberedMutableState")
@Composable
fun MainScreen() {
   Surface(color = Color.LightGray) {
       Column(modifier = Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally
       ) {

           var myString = remember {
               mutableStateOf("Android Compose")
           }


           TextField(value = myString.value  , onValueChange = {
               myString.value = it
               println(myString.value)


           })

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


