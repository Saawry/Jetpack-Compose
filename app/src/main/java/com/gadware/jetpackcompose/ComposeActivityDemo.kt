package com.gadware.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class ComposeActivityDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisplayUserDetails(UserInfo("Abdullah","Dhaka, Bangladesh"))
        }
    }
}

@Composable
fun DisplayUserDetails(userInfo: UserInfo){
    Row {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "This Is Profile Picture"
        )
        Column {
            Text( "Name: ${userInfo.name}")
            Text( "Address: ${userInfo.address}")
        }
    }

}

data class UserInfo(val name: String, val address:String)
