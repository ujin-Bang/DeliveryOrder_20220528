package com.start.deliveryorder_20220528

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.start.deliveryorder_20220528.databinding.ActivityEditMyInfoBinding

class EditMyInfoActivity : AppCompatActivity() {

    lateinit var binding: ActivityEditMyInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_edit_my_info)
        setupEvents()
        setValues()
    }

    fun setupEvents(){
        binding.btnSave.setOnClickListener {
            val newNickname = binding.edtNickname.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("newNickname",newNickname)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }

    fun setValues(){
    }
}
