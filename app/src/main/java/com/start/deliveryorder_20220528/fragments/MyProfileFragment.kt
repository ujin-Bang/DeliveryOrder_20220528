package com.start.deliveryorder_20220528.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.start.deliveryorder_20220528.EditMyInfoActivity
import com.start.deliveryorder_20220528.R
import com.start.deliveryorder_20220528.databinding.FragmentMyProfilBinding
import com.start.deliveryorder_20220528.databinding.FragmentPizzaStoreListBinding

class MyProfileFragment: Fragment() {

    lateinit var binding: FragmentMyProfilBinding

    val REQ_CODE_NIKCKNAME = 1000

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_profil, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.btnNicknameChange.setOnClickListener {
            val myIntent = Intent(requireContext(),EditMyInfoActivity::class.java)
            startActivityForResult(myIntent,REQ_CODE_NIKCKNAME)
        }
    }
}