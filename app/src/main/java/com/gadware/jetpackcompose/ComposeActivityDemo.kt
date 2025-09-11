package com.gadware.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class ComposeActivityDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowColumn()
        }
    }
}


@Composable
fun ShowColumn(){
    Column {//displays contents vertically
        Text( "this is a text ")
        Text( "this is second text ")
    }

}
@Preview
@Composable
fun ShowRow(){
    Row {//displays contents horizontally
        Text( "this is a text ")
        Text( "this is second text ")
    }

}
