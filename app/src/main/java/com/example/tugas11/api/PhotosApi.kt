package com.example.tugas11.api


import com.example.tugas11.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}