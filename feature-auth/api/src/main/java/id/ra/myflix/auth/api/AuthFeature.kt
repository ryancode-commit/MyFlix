package id.ra.myflix.auth.api

import id.ra.myflix.designsystem.presentation.navigation.FeatureEntry

interface AuthFeature : FeatureEntry {
    val authRoute :String
}