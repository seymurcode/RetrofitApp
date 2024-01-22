package com.sirketismi.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SegmentAttributes(
    val free_meal: Boolean
): Parcelable