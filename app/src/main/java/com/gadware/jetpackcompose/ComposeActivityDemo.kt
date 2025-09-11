package com.gadware.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent

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
    Row(modifier = Modifier.padding(5.dp)) {//// Add padding around our message
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "This Is Profile Picture",
            modifier = Modifier.size(40.dp)//// Set image size to 40 dp
                .clip(CircleShape)//// Clip image to be shaped as a circle
        )

        Spacer(modifier = Modifier.width(5.dp))//// Add a horizontal space between the image and the column
        Column {
            Text( "Name: ${userInfo.name}")
            Spacer(modifier = Modifier.height(4.dp))//// Add a vertical space between the name and address texts
            Text( "Address: ${userInfo.address}")
        }
    }

}

data class UserInfo(val name: String, val address:String)
