package com.alejojamc.swiftroutes.domain.repository.record

import com.alejojamc.swiftroutes.domain.model.AgentStatus
import com.alejojamc.swiftroutes.domain.model.Location
import jakarta.persistence.*

@Entity
@Table(name = "delivery_agents")
data class DeliveryAgentRecord(
    @Id
    val id: String,

    @Embedded
    val currentLocation: Location,

    @ElementCollection
    @CollectionTable(name = "assigned_orders", joinColumns = [JoinColumn(name = "agent_id")])
    @Column(name = "order_destination")
    val assignedOrders: MutableList<Order>,

    @Enumerated(EnumType.STRING)
    val status: AgentStatus = AgentStatus.IDLE
)