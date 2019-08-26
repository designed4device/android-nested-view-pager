package com.example.nestedviewpager

import android.os.Parcel
import android.os.Parcelable

data class DataView(val color: Int, val text: String) : Parcelable {
    constructor(source: Parcel) : this(
        source.readInt(),
        source.readString()?: ""
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeInt(color)
        writeString(text)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<DataView> = object :
            Parcelable.Creator<DataView> {
            override fun createFromParcel(source: Parcel): DataView =
                DataView(source)
            override fun newArray(size: Int): Array<DataView?> = arrayOfNulls(size)
        }
    }
}