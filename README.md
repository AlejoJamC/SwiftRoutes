# SwiftRoutes
An Intelligent Delivery Optimization System - "Smart routes for seamless deliveries"

## Description:
The system manages and optimizes delivery routes for a fleet of vehicles. Each vehicle is modeled as an autonomous agent that makes decisions based on:
1.	Real-time traffic conditions.
2.	Assigned delivery orders.
3.	Weather conditions.
4.	Interaction with other vehicles (to avoid route conflicts).

## Objective:
Demonstrate how a backend system can handle the complexity of a MAS using Spring AI to enable cognitive capabilities in agents and Kotlin for business logic development.

## System Architecture

1. Key Components:
    1.	Agents (Vehicles):
          •	Each vehicle is an autonomous agent.
          •	Decides its routes using AI models integrated into the backend.
    2.	Central Controller (Optional):
          •	Coordinates communication among agents and supervises global rules.
    3.	Backend (Spring AI + Kotlin):
          •	Implements MAS logic and connects to AI models.
          •	Exposes REST APIs for traffic data, order assignments, and delivery monitoring.
    4.	External Data Sources:
          •	Traffic APIs (Google Maps, OpenStreetMap).
          •	Weather APIs.

2. Backend Flow Diagram:
Orders -> Backend (Spring AI) -> Agents -> Decisions (Routes/Actions) -> Execution (Deliveries)

## Technologies:
Spring AI: A Spring Boot application that integrates AI models for decision-making in agents.

Kotlin: A modern programming language for backend development.

OLlama: A MAS library for Kotlin.

PostgreSQL: A relational database for storing orders and traffic data.

Docker: Containerization for easy deployment.

_TODO: Add InfluxDB: A time-series database for storing real-time traffic data._