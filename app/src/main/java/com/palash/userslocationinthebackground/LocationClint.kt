package com.palash.userslocationinthebackground

import android.location.Location
import kotlinx.coroutines.flow.Flow

interface LocationClint {
    fun getLocationUpdate(interval : Long) : Flow<Location>
    class LocationException(message : String) : Exception()
}