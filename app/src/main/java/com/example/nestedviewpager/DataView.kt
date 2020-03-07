package com.example.nestedviewpager

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataView(val color: Int, val message: String) : Parcelable