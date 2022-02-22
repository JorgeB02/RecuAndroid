package com.api.Peliculas.nucleo

import com.api.Peliculas.datos.ProductEndpoints
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkManager {
    private val logging = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    private val client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.1.36:3000/products/")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(ProductEndpoints::class.java)
}