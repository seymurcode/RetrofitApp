package com.sirketismi.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class SearchResponse(
    val data: Data?
) : Parcelable

