package com.sirketismi.entities.model

data class Departure(
    val average_price_breakdown: AveragePriceBreakdown,
    val different_airline_count: Int,
    val enuid: String,
    val infos: Infos,
    val price_breakdown: PriceBreakdown,
    val provider_packages: List<Any>,
    val segments: List<Segment>
)