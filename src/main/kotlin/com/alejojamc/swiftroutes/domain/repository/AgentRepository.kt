package com.alejojamc.swiftroutes.domain.repository

import com.alejojamc.swiftroutes.domain.repository.record.DeliveryAgentRecord
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AgentRepository: JpaRepository<DeliveryAgentRecord, String>