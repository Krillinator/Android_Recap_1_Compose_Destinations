package com.krillinator.recap_1_navigation_composedestination.api

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.lang.Exception
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

object FoxRetrofit {

    private const val BASE_URL = "https://randomfox.ca/floof/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private val getFoxApi by lazy {
        retrofit.create<FoxApi>().getInfo()
    }

    suspend fun fetchFox(): Fox {

        return suspendCoroutine { continuation ->
            getFoxApi.enqueue(object : Callback<Fox> {

                override fun onResponse(call: Call<Fox>, response: Response<Fox>) {
                    if (response.isSuccessful) {
                        val fox = response.body()
                        if (fox != null) {
                            continuation.resume(fox)
                        } else {
                            continuation.resumeWithException(Exception("Unsuccessful response: ${response.code()}"))
                        }
                    }
                }

                override fun onFailure(call: Call<Fox>, t: Throwable) {
                    println(t.message)
                }

            })
        }
    }
}