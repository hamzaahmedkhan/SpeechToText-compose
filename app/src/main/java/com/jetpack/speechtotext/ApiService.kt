package com.jetpack.speechtotext

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("search")
    suspend fun search(@Query("text") text: String): Response<List<String>>
}