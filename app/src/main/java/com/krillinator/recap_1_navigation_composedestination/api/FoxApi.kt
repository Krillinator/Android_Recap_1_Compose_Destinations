package com.krillinator.recap_1_navigation_composedestination.api

import retrofit2.Call
import retrofit2.http.GET

interface FoxApi {

    @GET("/floof")
    fun getInfo(): Call<Fox>

}