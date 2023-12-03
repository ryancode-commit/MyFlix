package id.ra.myflix.auth.impl.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.ra.myflix.auth.impl.AuthFeatureImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthFeatureModule {
    @Provides
    @Singleton
    fun provideAuthFeature() = AuthFeatureImpl()
}