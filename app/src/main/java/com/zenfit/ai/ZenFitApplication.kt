package com.zenfit.ai

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ZenFitApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize any application-wide dependencies here
    }
}