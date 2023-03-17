package com.example.myfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myfamily.GuardFragment.Companion.newInstance
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener {

            if(it.itemId==R.id.man_gard){
                inflateFragment(GuardFragment.newInstance())
            }
            else if (it.itemId == R.id.man_home) {
                inflateFragment(HomeFragment.newInstance())
            }
            else if (it.itemId == R.id.man_deshboard) {
                inflateFragment(DeshboardFragment.newInstance())
            }
            else if (it.itemId == R.id.man_profile) {
                inflateFragment(ProfileFragment.newInstance())
            }




        true
        }
    }

    private fun inflateFragment(newInstance:Fragment) {
   val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,newInstance())
        transaction.commit()
    }
}