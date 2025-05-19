package com.mahshad.rxjavaoperators

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

data class User(val name: String)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val observable = Observable.create { emitter ->
            try {
                for (i in 0..10) {
                    emitter.onNext(i)
                }
                emitter.onComplete()

            } catch (e: Exception) {
                Log.e("TAG", "onCreate: ${e.message}")
            }

        }
        val observer = object : Observer<Int> {
            override fun onSubscribe(d: Disposable) {
                println("")
            }

            override fun onError(e: Throwable) {
                println("")
            }

            override fun onComplete() {
                println("")
            }

            override fun onNext(t: Int) {
                println("Next item: $t")
            }
        }
        observable.subscribe(observer)
    }
}