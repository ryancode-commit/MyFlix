package id.ra.myflix.auth.impl.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.ra.myflix.auth.api.AuthFeature
import id.ra.myflix.auth.impl.AuthFeatureImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class AuthModule {

    @Binds
    abstract fun bindAuthFeature(
        authFeature: AuthFeatureImpl
    ):AuthFeature

}