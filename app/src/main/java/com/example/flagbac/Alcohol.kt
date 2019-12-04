package com.example.flagbac

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
// Ignore warning, it works fine. Throwing error is a problem with the IDE.
data class Alcohol(
    var name: String,
    var brewery: String,
    var imgID: Int,
    var soldVia: ArrayList<Store> = ArrayList<Store>()) : Parcelable {

}
