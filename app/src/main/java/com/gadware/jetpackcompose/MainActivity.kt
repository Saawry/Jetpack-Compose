package com.gadware.jetpackcompose

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /////following code shows how to use composable on existing xml layout file
        setContentView(R.layout.activity_main)
        //find ComposeViewById which is declared in xml layout
        val composeView=findViewById<ComposeView>(R.id.compose_view)
        composeView.setContent {// user setContent method to show ui component or composable function
            FirstComposableFunc()//calling a composable function
            Text("Demo Text")// displays  a textview
        }
    }
}
@Composable//use annotation to make a func composable
private fun FirstComposableFunc(){
    Text("Bismillah")
}