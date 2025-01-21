package com.alejojamc.swiftroutes.domain.model

data class DeliveryAgent(
    val id: String,
    val currentLocation: Location,
    val assignedOrders: MutableList<Order>,
    val status: AgentStatus = AgentStatus.IDLE
)