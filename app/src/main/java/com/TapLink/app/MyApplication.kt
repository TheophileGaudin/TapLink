package com.TapLink.app

import android.app.Application
import com.rayneo.arsdk.android.MercurySDK

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize MercurySDK with the Application context
        MercurySDK.init(this)
    }
}