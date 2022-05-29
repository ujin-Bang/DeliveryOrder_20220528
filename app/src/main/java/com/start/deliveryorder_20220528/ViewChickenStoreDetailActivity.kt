package com.start.deliveryorder_20220528

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.start.deliveryorder_20220528.databinding.ActivityViewChickenStoreDetailBinding

class ViewChickenStoreDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewChickenStoreDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_chicken_store_detail)
        setValues()
        setupEvents()

    }

    fun setupEvents(){

    }

    fun setValues(){

    }
}