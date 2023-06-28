package com.techfortyone.propertyfinder.data.model

data class Facility(
    val exclusions: List<List<Exclusion>>,
    val facilities: List<FacilityItem>
)