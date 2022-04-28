package com.mad.e.wellnesscompose.model

import java.io.Serializable

data class Session(
    val id: Int,
    val title: String,
    val presenter: String,
    val time: Int,
    val bitmap: String,
    ) : Serializable