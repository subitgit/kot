package com.zyc.kotvideoapplication

import android.app.Application
import com.squareup.leakcanary.LeakCanary

class KApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        LeakCanary.install(this)
    }
}