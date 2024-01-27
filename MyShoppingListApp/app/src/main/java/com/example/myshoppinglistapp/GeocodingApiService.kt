package com.example.myshoppinglistapp

import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingApiService {

    @GET("maps/api/geocode/json")
    suspend fun getAddressFromCoodinates(
        @Query("latlng") latlng: String,
        @Query("key") key: String
    ): GeocodingResponse
}