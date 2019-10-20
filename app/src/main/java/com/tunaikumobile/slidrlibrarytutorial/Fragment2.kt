package com.tunaikumobile.slidrlibrarytutorial


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrConfig
import com.r0adkll.slidr.model.SlidrInterface
import com.r0adkll.slidr.model.SlidrPosition
import kotlinx.android.synthetic.main.fragment_fragment2.*

/**
 * A simple [Fragment] subclass.
 */
class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_fragment2, container, false)

        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnNextFragment.setOnClickListener {
            loadFragment(Fragment3())

//            Intent(activity!!.applicationContext, Activity2::class.java).run {
//                activity!!.startActivity(this)
//            }
        }
    }

    fun loadFragment(fragment: Fragment) {
//        fragmentManager?.beginTransaction()!!
//            .add(R.id.main_container, fragment)
//            .commitAllowingStateLoss()
        fragmentManager?.beginTransaction()!!
            .add(R.id.flFragment2, fragment)
            .commit()
    }
}
