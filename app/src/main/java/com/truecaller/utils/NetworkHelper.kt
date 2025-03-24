package com.truecaller.utils

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.URL
import javax.inject.Inject

class NetworkHelper @Inject constructor() {
    // Implement any necessary logic for network operations here
    suspend fun fetchHtmlContent(url: String): String = withContext(Dispatchers.IO) {
        return@withContext URL(url).readText()
    }
}