package com.start.deliveryorder_20220528

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.start.deliveryorder_20220528.databinding.ActivityViewChickenStoreDetailBinding
import com.start.deliveryorder_20220528.datas.ChickenStoreData

class ViewChickenStoreDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewChickenStoreDetailBinding
    lateinit var mChickenStoreData : ChickenStoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_chicken_store_detail)
        setValues()
        setupEvents()

    }

    fun setupEvents(){

    }

    fun setValues(){
        mChickenStoreData = intent.getSerializableExtra("storeData") as ChickenStoreData
        binding.txtStoreName.text = mChickenStoreData.storeName
        binding.txtPhoneNum.text = mChickenStoreData.phoneNum
        Glide.with(this).load(mChickenStoreData.logoURL).into(binding.imgLogo)

    }
}