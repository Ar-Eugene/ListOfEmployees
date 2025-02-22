package com.example.listofemployees.data.network

import com.example.listofemployees.data.dto.Responce

class RetrofitNetworkClient(private val listApi: ListApi) : NetworkClient {
    override suspend fun doRequest(dto: Any): Responce {
        TODO("Not yet implemented")
    }
}