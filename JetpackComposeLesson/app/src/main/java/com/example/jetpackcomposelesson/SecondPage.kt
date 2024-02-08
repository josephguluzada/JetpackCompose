package com.example.jetpackcomposelesson

import androidx.activity.compose.BackHandler
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
fun SecondPage(navController: NavController, name : String, age : Int){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "2. page")
        Text(text = name)
        Text(text = age.toString())
//        BackHandler(onBack = { println("Clicked on BACK")})
        Button(onClick = { navController.navigate("third_page"){
//           popUpTo("second_page"){
//               inclusive = true
//         }
        } }) {
            Text(text = "Next")
        }
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Back")
        }
//        Button(onClick = { navController.navigate("first_page") }) {
//            Text(text = "Back")
//        }
    }
}