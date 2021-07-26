package com.picovr.killapplication

import android.app.ActivityManager
import android.content.Context
import android.util.Log

class KillAppClass {
    private val TAG = "KillApp"

    fun killApp(packageName: String, context: Context) {
        Log.e(TAG, "killapp: ")
        val am = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        am.killBackgroundProcesses(packageName)
    }
}