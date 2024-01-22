package com.sirketismi.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Flights(
    val departure: List<Departure>?
) : Parcelable