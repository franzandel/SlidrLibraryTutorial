package com.tunaikumobile.slidrlibrarytutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class FragmentActivityTest : FragmentActivity() {

    private var fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        loadFragment(Fragment2())
    }

    fun loadFragment(fragment: Fragment) {
//        fragmentManager.beginTransaction()
//            .replace(R.id.flFragmentActivity, fragment)
//            .commitAllowingStateLoss()
        fragmentManager.beginTransaction()
            .add(R.id.flFragmentActivity, fragment)
            .commit()
    }
}
