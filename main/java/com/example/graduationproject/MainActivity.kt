package com.example.graduationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.graduationproject.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imgMenu = findViewById<ImageView>(R.id.imgmenu)
        val layout = findViewById<DrawerLayout>(R.id.drawarlayout)
        imgMenu.setOnClickListener {
            fragAc(fragmentHome())
            layout.openDrawer(GravityCompat.START)
        }


    }

    private fun fragAc(a: Fragment) {
        val fragac = supportFragmentManager.beginTransaction()
        fragac.replace(R.id.layout_arayüz, a)
        fragac.commit()

    }
}