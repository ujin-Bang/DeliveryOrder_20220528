package com.start.deliveryorder_20220528

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.start.deliveryorder_20220528.databinding.ActivityMainBinding
import com.start.deliveryorder_20220528.databinding.ActivityViewStoreDetailBinding

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewStoreDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_store_detail)
        setValues()
        setupEvents()
    }

    fun setupEvents(){

    }

    fun setValues(){

    }
}