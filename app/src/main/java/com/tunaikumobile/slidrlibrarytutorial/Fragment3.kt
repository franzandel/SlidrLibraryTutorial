package com.tunaikumobile.slidrlibrarytutorial


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface
import com.r0adkll.slidr.model.SlidrPosition
import com.r0adkll.slidr.model.SlidrConfig


/**
 * A simple [Fragment] subclass.
 */
class Fragment3 : Fragment() {

    lateinit var slidrInterface: SlidrInterface

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment3, container, false)
    }

    override fun onResume() {
        super.onResume()
        slidrInterface = Slidr.replace(
            view!!.findViewById(R.id.flFragment3),
            SlidrConfig.Builder().position(SlidrPosition.LEFT).build()
        )
    }
}
