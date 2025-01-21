package com.alejojamc.swiftroutes.domain.model

data class Route(
    val id: String,
    val origin: Location,
    val destination: Location,
    val status: RouteStatus = RouteStatus.PENDING
)
