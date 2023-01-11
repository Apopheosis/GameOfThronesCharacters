package com.example.retrofit.services

import com.example.retrofit.models.Character
import retrofit2.Call
import retrofit2.http.*

interface IRetrofitService {
    @GET("api/characters?page=2&pageSize=50")
    fun getCharacter() : Call<MutableList<Character>>
}