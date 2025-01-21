package com.alejojamc.swiftroutes.domain.model

data class WeatherData(
    val id: String,
    val location: Location,
    val temperature: Double,
    val humidity: Double,
    val pressure: Double
)
