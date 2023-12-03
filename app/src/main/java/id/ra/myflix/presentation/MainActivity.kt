package id.ra.myflix.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import id.ra.myflix.auth.api.AuthFeature
import id.ra.myflix.designsystem.presentation.theme.MyFlixTheme
import id.ra.myflix.home.impl.presentation.screen.home.HomeScreen
import id.ra.myflix.presentation.navigation.AppNavigation
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var authFeature: AuthFeature

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFlixTheme {
                MyFlixApplication(authFeature)
            }
        }
    }
}

@Composable
fun MyFlixApplication(
    authFeature: AuthFeature
) {
    val navController = rememberNavController()

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        AppNavigation(startDestination = authFeature.authRoute, navController = navController , authFeature = authFeature)
    }
}

