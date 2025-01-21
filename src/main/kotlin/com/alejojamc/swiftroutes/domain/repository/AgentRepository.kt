package com.alejojamc.swiftroutes.domain.repository

import com.alejojamc.swiftroutes.domain.model.DeliveryAgent

interface AgentRepository {
    fun findById(id: String): DeliveryAgent?
    fun findAll(): List<DeliveryAgent>
    fun save(agent: DeliveryAgent)
    fun deleteById(id: String)
}