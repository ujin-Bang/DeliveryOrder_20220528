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
import com.start.deliveryorder_20220528.databinding.ActivityMainBinding
import com.start.deliveryorder_20220528.databinding.ActivityViewStoreDetailBinding
import com.start.deliveryorder_20220528.datas.StoreData
import java.io.Serializable

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewStoreDetailBinding
    lateinit var mStoreData: StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_store_detail)
        setValues()
        setupEvents()


    }

    fun setupEvents(){

        binding.btnCall.setOnClickListener {

            val permissionListener = object : PermissionListener{
                override fun onPermissionGranted() {
                    val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                    Toast.makeText(this@ViewStoreDetailActivity, "권한 허용 불가로 전화연결이 되지 않습니다.", Toast.LENGTH_SHORT).show()
                }

            }
            TedPermission.create()
                .setPermissionListener(permissionListener)
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()
            
        }

        binding.btnMove.setOnClickListener {
            val myUri = Uri.parse("${mStoreData.homePageURL}")
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)
        }

    }

    fun setValues(){

        mStoreData = intent.getSerializableExtra("store") as StoreData

        Glide.with(this).load(mStoreData.logoURL).into(binding.imgLogo)
        binding.txtStoreName.text = mStoreData.name
        binding.txtPhoneNum.text = mStoreData.phoneNum
        binding.btnMove.text = "==>${mStoreData.name}홈페이지로 바로가기<=="
    }
}