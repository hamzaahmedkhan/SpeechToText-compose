package com.jetpack.speechtotext

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @POST("gptBot")
    suspend fun chat(@Body chatRequestDto: ChatRequestDto): Response<Any>
}