package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.finalproject.fragments.GameFragment
import com.example.finalproject.fragments.LearningFragment
import com.example.finalproject.fragments.Top10Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val learningFragment = LearningFragment()
        val top10Fragment = Top10Fragment()
        val gameFragment = GameFragment()
        val btn = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        makeCurrentFragment(learningFragment)



        btn.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_learning -> makeCurrentFragment(learningFragment)
                R.id.ic_top10 -> makeCurrentFragment(top10Fragment)
                R.id.ic_videogame -> makeCurrentFragment(gameFragment)

            }
            true
        }


    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}