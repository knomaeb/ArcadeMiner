package com.example.arcademiner.data.remote

import com.example.arcademiner.di.ApiKey
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(@ApiKey private val apiKey : String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val newRequest = originalRequest.newBuilder()
            .header("X-RapidAPI-Key", apiKey)
        val request = newRequest.build()
        return chain.proceed(request)
    }
}