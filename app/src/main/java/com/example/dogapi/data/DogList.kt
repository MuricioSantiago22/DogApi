package com.example.dogapi.data

import com.google.gson.annotations.SerializedName

data class DogList(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
)
