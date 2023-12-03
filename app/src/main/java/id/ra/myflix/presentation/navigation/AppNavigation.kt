package id.ra.myflix.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import id.ra.myflix.auth.api.AuthFeature
import id.ra.myflix.designsystem.utils.register

@Composable fun AppNavigation(
    startDestination:String,
    navController:NavHostController,
    authFeature: AuthFeature
){
    NavHost(
        navController = navController,
        startDestination = startDestination ,
        modifier = Modifier
    ){
        register(
            authFeature,
            navController
        )
    }
}