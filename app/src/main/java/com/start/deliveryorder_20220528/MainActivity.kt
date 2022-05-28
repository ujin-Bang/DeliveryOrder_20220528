package com.start.deliveryorder_20220528

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.start.deliveryorder_20220528.adapters.MainViewPagerAdapter
import com.start.deliveryorder_20220528.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mvpa: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents(){

    }

    fun setValues(){

        mvpa = MainViewPagerAdapter(supportFragmentManager)
        binding.mainViewPager.adapter = mvpa

    }
}