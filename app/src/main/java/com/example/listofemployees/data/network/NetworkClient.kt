package com.example.listofemployees.data.network

import com.example.listofemployees.data.dto.Responce

interface NetworkClient {
    suspend fun doRequest(dto: Any): Responce
}