package com.sirketismi.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class AveragePriceBreakdown(
    val base: Int,
    val currency: String,
    val discount: Int,
    val displayed_currency: String,
    val extra_fee: Int,
    val internal_assurance: Int,
    val penalty: Int,
    val reissue_service: Int,
    val service: Double,
    val tax: Int,
    val total: Double
): Parcelable