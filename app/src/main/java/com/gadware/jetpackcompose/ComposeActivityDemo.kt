package com.gadware.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gadware.jetpackcompose.ui.theme.JetpackComposeTheme

class ComposeActivityDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 1.5.dp,modifier = Modifier.fillMaxSize()) {
                    DisplayUserDetails(SampleData.userInfoList)
                }

            }

        }
    }
}

//@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark Mode")
@Composable
fun DisplayUserDetails(userList:List<UserDetails>){
    LazyColumn { items(userList){
        user->DisplayUserInfo(user)
    } }
}


@Composable
fun DisplayUserInfo(userInfo: UserDetails = UserDetails("Abdullah", "Dhaka, Bangladesh")){
    UserDetails("Abdullah", "Dhaka, Bangladesh")
    Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 1.5.dp) {
        Row(modifier = Modifier.padding(5.dp)) {//// Add padding around our message
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "This Is Profile Picture",
                modifier = Modifier
                    .size(40.dp)//// Set image size to 40 dp
                    .clip(CircleShape)//// Clip image to be shaped as a circle
                    .border(
                        1.5.dp,
                        MaterialTheme.colorScheme.primary,
                        CircleShape
                    )//adding a circular border
            )

            Spacer(modifier = Modifier.width(5.dp))//// Add a horizontal space between the image and the column
            var isExpanded by remember { (mutableStateOf(false)) }//save and track the state of expanded
            //surface color change will be animated on click
            val surfaceColor by animateColorAsState(if (isExpanded) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary)
            Column(modifier = Modifier.clickable{isExpanded=!isExpanded}) {//toggle value
                Text(
                    "Name: ${userInfo.name}",
                    color = MaterialTheme.colorScheme.secondary,//setting font color
                    style = MaterialTheme.typography.titleSmall,//setting font style
                    fontSize = 22.sp//setting font size
                )
                Spacer(Modifier.height(4.dp))//// Add a vertical space between the name and address texts
                Surface(
                    shape = MaterialTheme.shapes.medium,
                    color = surfaceColor,// on click surface color will change with animation
                    shadowElevation = 2.dp,
                    modifier = Modifier
                        .animateContentSize()//content resize will happen with animation
                        .padding(1.dp)
                ) {
                Text(
                    "Address: ${userInfo.address}",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = if(isExpanded) Int.MAX_VALUE else 1//set max line
                )
                }
            }
        }
    }
}


