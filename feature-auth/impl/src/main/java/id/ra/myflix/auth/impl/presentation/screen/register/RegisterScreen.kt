package id.ra.myflix.auth.impl.presentation.screen.register

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable fun RegisterScreen(
    onToLogin : () -> Unit
){
    Column {
        Text(text = "Register Screen")
        Button(onClick = {onToLogin()}) {
            Text(text = "Go to Login screen")
        }
    }
}