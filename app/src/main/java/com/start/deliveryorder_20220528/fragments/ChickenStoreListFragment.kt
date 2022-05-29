package com.start.deliveryorder_20220528.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.start.deliveryorder_20220528.R
import com.start.deliveryorder_20220528.databinding.FragmentChickenStoreListBinding

class ChickenStoreListFragment: Fragment() {

    lateinit var binding: FragmentChickenStoreListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       binding = DataBindingUtil.inflate(inflater,R.layout.fragment_chicken_store_list, container, false)
       return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}