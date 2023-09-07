package com.jetpack.speechtotext

import retrofit2.Response

class SearchRepository(private val apiService: ApiService) {
    suspend fun getSearchResult(text: String): Response<List<String>> {
//        return Response.success(listOf<String>("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"
//        , "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"))
        return apiService.search(text)
    }
}