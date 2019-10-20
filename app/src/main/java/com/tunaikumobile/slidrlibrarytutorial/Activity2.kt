package com.tunaikumobile.slidrlibrarytutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface
import kotlinx.android.synthetic.main.activity_2.*



class Activity2 : AppCompatActivity() {

    lateinit var slidrInterface : SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        slidrInterface = Slidr.attach(this)

        btnLockSlide.setOnClickListener {
            lockSlide()
        }

        btnUnlockSlide.setOnClickListener {
            unlockSlide()
        }
    }

    fun lockSlide() {
        slidrInterface.lock()
    }

    fun unlockSlide() {
        slidrInterface.unlock()
    }
}
