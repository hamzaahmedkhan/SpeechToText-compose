package com.jetpack.speechtotext

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object NetworkModule {
    private val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
        this.level = HttpLoggingInterceptor.Level.BODY
    }
    private var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://ae8tcq6hs1.execute-api.ap-southeast-1.amazonaws.com/prod/") //base url
        .client(OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build())
        .addConverterFactory(
            GsonConverterFactory.create(
                GsonBuilder()
                    .setLenient()
                    .create()
            )
        )
        .build()

    var service: ApiService = retrofit.create(ApiService::class.java)
}

