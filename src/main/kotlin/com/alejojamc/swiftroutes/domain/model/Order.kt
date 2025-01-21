package com.alejojamc.swiftroutes.domain.model

data class Order(
    val id: String,
    val origin: Location,
    val destination: Location,
    val status: OrderStatus = OrderStatus.PENDING
)
