package com.alejojamc.swiftroutes.domain.repository.record

import com.alejojamc.swiftroutes.domain.model.Location
import com.alejojamc.swiftroutes.domain.model.OrderStatus
import jakarta.persistence.Embeddable

@Embeddable
data class Order(
    val id: String,
    val origin: Location,
    val destination: Location,
    val status: OrderStatus = OrderStatus.PENDING
)
