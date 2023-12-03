package id.ra.myflix.auth.impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import id.ra.myflix.auth.api.AuthFeature
import id.ra.myflix.auth.impl.presentation.screen.login.LoginScreen
import id.ra.myflix.auth.impl.presentation.screen.register.RegisterScreen
import id.ra.myflix.designsystem.utils.composable
import javax.inject.Inject

class AuthFeatureImpl : AuthFeature{
    override val authRoute: String
        get() = AuthRoute.Login.route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(
            route = AuthRoute.Login.route
        ){
            LoginScreen(
                onToRegister = {
                    navController.navigate(AuthRoute.Register.route)
                }
            )
        }

        navGraphBuilder.composable(
            route = AuthRoute.Register.route
        ){
            RegisterScreen(
                onToLogin = {
                    navController.popBackStack()
                }
            )
        }
    }

}