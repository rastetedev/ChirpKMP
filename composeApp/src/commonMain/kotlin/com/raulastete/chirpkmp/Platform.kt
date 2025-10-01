package com.raulastete.chirpkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform