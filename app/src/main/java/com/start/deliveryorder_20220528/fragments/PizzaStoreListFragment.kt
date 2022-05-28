package com.start.deliveryorder_20220528.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.start.deliveryorder_20220528.R
import com.start.deliveryorder_20220528.adapters.PizzaStoreAdapter
import com.start.deliveryorder_20220528.databinding.FragmentPizzaStoreListBinding
import com.start.deliveryorder_20220528.datas.StoreData

class PizzaStoreListFragment: Fragment() {

    lateinit var binding: FragmentPizzaStoreListBinding
    val mPizzaStoreList = ArrayList<StoreData>()

    lateinit var mPizzStoreAdapter: PizzaStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pizza_store_list, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        동작 관련 코드 작성 예정
        mPizzaStoreList.add(StoreData("피자헛", "1588-5588","https://ohfun.net/contents/article/images/2016/0407/1459999715685318.jpeg"))
        mPizzaStoreList.add(StoreData("파파존스", "1577-8080","https://mblogthumb-phinf.pstatic.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"))
        mPizzaStoreList.add(StoreData("미스터피자","1577-0077","https://mblogthumb-phinf.pstatic.net/20160530_171/ppanppane_14646177044221JRNd_PNG/%B9%CC%BD%BA%C5%CD%C7%C7%C0%DA_%B7%CE%B0%ED_%281%29.png?type=w800"))
        mPizzaStoreList.add(StoreData("도미노피자","1577-308","https://mblogthumb-phinf.pstatic.net/20160530_173/ppanppane_14646176567743d7hd_PNG/%B5%B5%B9%CC%B3%EB%C7%C7%C0%DA_%B7%CE%B0%ED_%282%29.png?type=w800"))

        mPizzStoreAdapter = PizzaStoreAdapter(requireContext(),R.layout.store_list_item, mPizzaStoreList)
        binding.pizzaStoreListView.adapter = mPizzStoreAdapter

        binding.pizzaStoreListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStore = mPizzaStoreList[position]
            val myIntent = Intent(requireContext(),??)
            myIntent.putExtra("store",clickedStore)
            startActivity(myIntent)
        }

    }
}