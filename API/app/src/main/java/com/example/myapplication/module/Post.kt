package com.example.myapplication

import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("userId")
    val userId: Int? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("body")
    val body: Int? = null,
)
