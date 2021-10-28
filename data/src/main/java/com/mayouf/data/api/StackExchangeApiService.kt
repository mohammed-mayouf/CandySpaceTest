package com.mayouf.data.api

import com.mayouf.data.entities.response.ResponseStackExchange
import retrofit2.http.GET
import retrofit2.http.Query

interface StackExchangeApiService {
    @GET("users")
    suspend fun getUsers(
        @Query("order") order: String,
        @Query("site") site: String,
        @Query("inname") name: String
    ): ResponseStackExchange
}