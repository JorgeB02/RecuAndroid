package com.api.Peliculas.datos
import com.api.Peliculas.datos.ProductObjectItem
import com.api.Peliculas.datos.ProductObjectRequest
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ProductEndpoints {
    @GET("/products/")
    fun getProducts(): Call<List<ProductObjectItem>>

    @GET("/products/{id}")
    fun getProductDetailed(@Path("id")id: Int): Call<ProductObjectItem>?

    @POST("/products/create/")
    fun savePost(@Body post: ProductObjectRequest): Call<ProductObjectRequest>

    @PUT("/products/update/{id}")
    fun savePut(@Path("id")id: Int,@Body post: ProductObjectItem): Call<ProductObjectItem>

    @DELETE("/products/delete/{id}")
    fun deletePost(@Path("id")id: Int): Call<Void>

}