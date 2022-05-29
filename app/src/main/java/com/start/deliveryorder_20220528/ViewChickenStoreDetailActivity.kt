package com.start.deliveryorder_20220528

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
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

        binding.btnCall.setOnClickListener {

            val permission = object : PermissionListener {
                override fun onPermissionGranted() {

                    val myUri = Uri.parse("tel:${mChickenStoreData.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                    Toast.makeText(this@ViewChickenStoreDetailActivity, "권한 허용불가로 통화연결이 되지않습니다.", Toast.LENGTH_SHORT)
                        .show()
                }

            }
            TedPermission.create()
                .setPermissionListener(permission)
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()

        }

    }

    fun setValues(){
        mChickenStoreData = intent.getSerializableExtra("storeData") as ChickenStoreData
        binding.txtStoreName.text = mChickenStoreData.storeName
        binding.txtPhoneNum.text = mChickenStoreData.phoneNum
        Glide.with(this).load(mChickenStoreData.logoURL).into(binding.imgLogo)

    }
}