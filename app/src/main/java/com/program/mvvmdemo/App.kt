package com.program.mvvmdemo

import android.app.Application
import android.os.Handler

class App  :Application() {
    companion object {
        val  handler = Handler()
    }

}