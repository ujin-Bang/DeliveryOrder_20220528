package com.start.deliveryorder_20220528

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.start.deliveryorder_20220528.databinding.ActivityEditMyInfoBinding

class EditMyInfoActivity : AppCompatActivity() {

    lateinit var binding: ActivityEditMyInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_edit_my_info)
    }
}