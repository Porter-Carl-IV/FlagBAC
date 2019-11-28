package com.example.flagbac

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
// Ignore warning, it works fine. Throwing error is a problem with the IDE.
data class Store(
    val name: String) : Parcelable {

}
