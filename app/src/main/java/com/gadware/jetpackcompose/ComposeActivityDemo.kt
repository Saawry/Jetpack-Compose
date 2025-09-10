package com.gadware.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class ComposeActivityDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserCard(UserInfo("Mohammad","Abdullah"))
        }
    }
}

@Composable
fun UserCard(user:UserInfo){
    Text("Name: ${user.name}")
    Text("Name: ${user.address}")
}

@Preview
@Composable
 fun PreviewUserInfo(){
    UserCard(user=UserInfo("Mohammad","Abdullah"))
}

data class UserInfo(val name:String, val address: String)
