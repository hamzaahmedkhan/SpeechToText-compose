package com.jetpack.speechtotext

import retrofit2.Response

class SearchRepository(private val apiService: ApiService) {
    suspend fun getSearchResult(text: String): String {
        return try {
            val apiResponse = apiService.chat(ChatRequestDto(text))
            if (apiResponse.isSuccessful) {
                apiResponse.body()!!.message
            } else {
                "API failure, errorCode: ${apiResponse.code()}"
            }
        } catch (e: Exception) {
            e.printStackTrace()
            "API exception, error: ${e.message}"
        }
    }
}