package com.example.mascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import coil.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login()


        }


    }


}



@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun Login() {

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {

        var user by remember { mutableStateOf("") }
        var pass by remember { mutableStateOf("") }
        var res by remember { mutableStateOf("NO HAY RESULTADO") }


        OutlinedTextField(
            value = user, onValueChange = { user = it },
            label = {
                Text(text = "Usuario:")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), singleLine = true


        )

        OutlinedTextField(
            value = pass, onValueChange = { pass = it },
            label = {
                Text(text = "Contraseña:")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), singleLine = true,
                visualTransformation = PasswordVisualTransformation()


        )
        Button(onClick = {
                         var cadena = ""
                        if(user.length == 0){
                            cadena = "No puede dejar el usuario vacio"


                        }else{

                            if(pass.length == 0){
                                cadena = "No puede dejar la contraseña vacia"}









                        }

            res = cadena


                         },
        modifier = Modifier
            .padding(10.dp)
            .align(Alignment.CenterHorizontally) ){

            Text(text = "Iniciar Sesion")

        }
        Text(text = res, modifier = Modifier.fillMaxWidth())

    }


}


