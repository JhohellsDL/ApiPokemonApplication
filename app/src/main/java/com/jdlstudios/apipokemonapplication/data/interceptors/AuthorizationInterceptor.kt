package com.jdlstudios.apipokemonapplication.data.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class AuthorizationInterceptor : Interceptor {

    private val apiKey = "your_api_key_here"

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        // Add API key as query parameter to the original request
       /* val modifiedUrl = originalRequest.newBuilder()
            .build()

        val modifiedRequest = originalRequest.newBuilder()
            .url(modifiedUrl)
            .build()*/

        return chain.proceed(originalRequest)
    }
}
