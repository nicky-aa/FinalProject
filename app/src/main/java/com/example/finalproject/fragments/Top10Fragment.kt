package com.example.finalproject.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.finalproject.R
import com.example.finalproject.ToptenActivity1
import com.example.finalproject.ToptenActivity2


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Top10Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Top10Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //var btn: Button = view?.findViewById(R.id.button) ?:
        val view = inflater.inflate(R.layout.fragment_top10, container, false)
        val btn =  view.findViewById<Button>(R.id.button)
        val btn2 =  view.findViewById<Button>(R.id.button3)
        btn?.setOnClickListener {
            val intent = Intent(activity, ToptenActivity1::class.java)
            startActivity(intent)
        }
        btn2?.setOnClickListener {
            val intent = Intent(activity, ToptenActivity2::class.java)
            startActivity(intent)
        }
        //return inflater.inflate(R.layout.fragment_top10, container, false)
        return  view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Top10Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Top10Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}