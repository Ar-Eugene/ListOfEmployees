package com.example.listofemployees.data.network

import com.example.listofemployees.data.dto.ListUserResponse
import retrofit2.http.GET

interface ListApi {
    @GET("users")
    suspend fun getListUsers():ListUserResponse
}