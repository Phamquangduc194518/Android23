package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable



data class WishList(
    var id: Int,
    var nameProduct: String,
    var cost: Double)
:Parcelable {


    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readDouble(),
    )
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(nameProduct)
        parcel.writeDouble(cost)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<WishList> {
        override fun createFromParcel(parcel: Parcel): WishList {
            return WishList(parcel)
        }

        override fun newArray(size: Int): Array<WishList?> {
            return arrayOfNulls(size)
        }
    }
}







