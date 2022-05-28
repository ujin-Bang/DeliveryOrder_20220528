package com.start.deliveryorder_20220528.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.start.deliveryorder_20220528.R
import com.start.deliveryorder_20220528.databinding.FragmentPizzaStoreListBinding

class PizzaStoreListFragment: Fragment() {

    lateinit var binding: FragmentPizzaStoreListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pizza_store_list, container, null)
        return binding.root
    }

}