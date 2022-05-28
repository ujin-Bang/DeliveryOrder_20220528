package com.start.deliveryorder_20220528

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.start.deliveryorder_20220528.databinding.ActivityMainBinding
import com.start.deliveryorder_20220528.databinding.ActivityViewStoreDetailBinding
import com.start.deliveryorder_20220528.datas.StoreData

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
       val storeData =  intent.getSerializableExtra("store") as StoreData
        Glide.with(this).load(storeData.logoURL).into(binding.imgLogo)
        binding.txtStoreName.text = storeData.name
        binding.txtPhoneNum.text = storeData.phoneNum
    }
}