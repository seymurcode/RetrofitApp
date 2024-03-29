package com.sirketismi.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Data(
    val airlines: List<Airline>?,
    val airports: List<Airport>?,
    val baggages: List<Int>?,
    val bus_search_data_tab: String?,
    val created_at: String?,
    val currencies: Currencies?,
    val filter_boundaries: FilterBoundaries?,
    val flights: Flights?,
    val has_vi_flight: Boolean?,
    val info_message: String?,
    val price_history: PriceHistory?,
    val search_parameters: SearchParameters?,
    val search_url: String?,
    val short_search_url: String?,
    val stop_counts: List<Int>?
) : Parcelable