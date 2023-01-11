package com.example.retrofit.services

object Common {
    private val URL = "https://www.anapioficeandfire.com/";
    val retrofitService: IRetrofitService
        get() = RetrofitClient.getClient(URL).create(IRetrofitService::class.java)
}