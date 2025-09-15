package com.gadware.jetpackcompose

/**
 * SampleData for Jetpack Compose Tutorial 
 */
object SampleData {
    // Sample conversation data
    val userInfoList = listOf(
        UserDetails(
            "Lexi",
            "Test...Test...Test..."
        ),
        UserDetails(
            "Lexi",
            """List of Android versions:
            |Android KitKat (API 19)
            |Android Lollipop (API 21)
            |Android Marshmallow (API 23)
            |Android Nougat (API 24)
            |Android Oreo (API 26)
            |Android Pie (API 28)
            |Android 10 (API 29)
            |Android 11 (API 30)
            |Android 12 (API 31)""".trim()
        ),
        UserDetails(
            "Lexi",
            """I think Kotlin is my favorite programming language.
            |It's so much fun!""".trim()
        ),
        UserDetails(
            "Lexi",
            "Searching for alternatives to XML layouts..."
        ),
        UserDetails(
            "Lexi",
            """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""".trim()
        ),
        UserDetails(
            "Lexi",
            "It's available from API 21+ :)"
        ),
        UserDetails(
            "Lexi",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        UserDetails(
            "Lexi",
            "Android Studio next version's name is Arctic Fox"
        ),
        UserDetails(
            "Lexi",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        UserDetails(
            "Lexi",
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        UserDetails(
            "Lexi",
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        UserDetails(
            "Lexi",
            "Previews are also interactive after enabling the experimental setting"
        ),
        UserDetails(
            "Lexi",
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}

data class UserDetails(val name: String,val address: String)
