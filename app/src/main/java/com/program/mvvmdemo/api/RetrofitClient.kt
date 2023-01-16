package com.program.mvvmdemo.api

import com.program.mvvmdemo.Api
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * 创建Retrofit已经提供API Service
 */
class RetrofitClient {

    val  okHttpClient = OkHttpClient.Builder()
        .callTimeout(30,TimeUnit.SECONDS)
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl(ApiService.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    val apiService = retrofit.create(ApiService::class.java)

}