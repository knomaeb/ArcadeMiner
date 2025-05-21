package com.example.arcademiner.di.module

import android.content.Context
import com.example.arcademiner.BuildConfig
import com.example.arcademiner.core.utils.AppConstants.BASE_URL
import com.example.arcademiner.core.utils.network.NetworkConnected
import com.example.arcademiner.di.ApiKey
import com.example.arcademiner.di.BaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Singleton
    @Provides
    fun provideNetworkConnected(@ApplicationContext context: Context) : NetworkConnected{
        return NetworkConnected(context)
    }

    @BaseUrl
    @Singleton
    @Provides
    fun provideBaseUrl(): String{
        return BASE_URL
    }

    @ApiKey
    @Singleton
    @Provides
    fun provideApiKey(): String{
        return BuildConfig.API_KEY
    }

    @Provides
    fun provideNetworkService(@BaseUrl baseUrl: BaseUrl, @ApiKey apiKey: ApiKey){}
}