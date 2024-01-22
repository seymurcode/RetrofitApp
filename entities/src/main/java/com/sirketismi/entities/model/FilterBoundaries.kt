package com.sirketismi.entities.model

data class FilterBoundaries(
    val departureMaxDuration: Int,
    val departurePrice: DeparturePrice,
    val returnMaxDuration: Int,
    val returnPrice: ReturnPrice
)