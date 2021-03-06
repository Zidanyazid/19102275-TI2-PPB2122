package com.zidanyazidhimawan_19102275.practice6

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

    @Parcelize
    data class MyData(
        var name: String,
        var description: String,
        var photo: String,
    ) : Parcelable