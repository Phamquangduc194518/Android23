package com.example.btvnbuoi61application

import android.os.Parcel
import android.os.Parcelable


data class FolderManager(var id: Int, var title: String, var content: String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeString(content)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FolderManager> {
        override fun createFromParcel(parcel: Parcel): FolderManager {
            return FolderManager(parcel)
        }

        override fun newArray(size: Int): Array<FolderManager?> {
            return arrayOfNulls(size)
        }
    }

}