package com.sirketismi.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PriceHistory(
    val departure: DepartureX
) : Parcelable