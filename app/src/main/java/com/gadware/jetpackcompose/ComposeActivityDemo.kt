package com.gadware.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

//extends componentActivity instead of AppCompatActivity
class ComposeActivityDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContent func will display the content. we have to call composable funcs here to show
        setContent {
            FirstFunc()
            SecondFunc("Alhamdulillah")//calling parameterized composable function
        }
    }
}

@Composable//use annotation to make a func composable
fun FirstFunc(){
    Text("Bismillah")
}
@Preview//to preview, use annotation. (showSystemUi = true) can be used to show system ui
@Composable
fun SecondFunc(data:String="Alhamdulillah"){//there must be a default value of parameters to preview
    Text("Say $data")
}