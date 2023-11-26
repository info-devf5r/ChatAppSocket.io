package com.example.socketchat

import android.app.Application
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket

class MyApp : Application() {

    private var mSocket: Socket? = IO.socket("http://server.devf5r.com:4000")

    fun getSocket (): Socket? {
        return mSocket
    }

}