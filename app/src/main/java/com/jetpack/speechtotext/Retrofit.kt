package com.jetpack.speechtotext

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/") //base url
        .client(OkHttpClient.Builder().build())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: ApiService = retrofit.create(ApiService::class.java)
}