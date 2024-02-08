package com.example.jetpackcomposelesson

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SecondPage(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "2. page")
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Back")
        }
//        Button(onClick = { navController.navigate("first_page") }) {
//            Text(text = "Back")
//        }
    }
}