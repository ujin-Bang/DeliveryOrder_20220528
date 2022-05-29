package com.start.deliveryorder_20220528.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.start.deliveryorder_20220528.R
import com.start.deliveryorder_20220528.adapters.ChickenStoreAdapter
import com.start.deliveryorder_20220528.databinding.FragmentChickenStoreListBinding
import com.start.deliveryorder_20220528.datas.ChickenStoreData

class ChickenStoreListFragment: Fragment() {

    lateinit var binding: FragmentChickenStoreListBinding
    val mChickenStoreList = ArrayList<ChickenStoreData>()
    lateinit var mChickenStoreAdapter : ChickenStoreAdapter

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

        mChickenStoreList.add(ChickenStoreData("교촌치킨","1577-1991","https://image.news1.kr/system/photos/2012/1/30/68763/article.png?1327907438","https://kyochon.com/"))
        mChickenStoreList.add(ChickenStoreData("굽네치킨","1661-9494","https://www.goobne.co.kr/resources/images/contents/brand/BI_ENG_2.jpg","https://www.goobne.co.kr/"))
        mChickenStoreList.add(ChickenStoreData("BHC치킨","1577-5577","https://www.bhc.co.kr/images/common/logo300.jpg","https://www.bhc.co.kr/"))
        mChickenStoreList.add(ChickenStoreData("두마리치","1688-9922","https://mblogthumb-phinf.pstatic.net/20160507_53/ppanppane_1462551164287GLdNC_PNG/Untitled-1-39.png?type=w800","http://www.9922.co.kr/"))

        mChickenStoreAdapter = ChickenStoreAdapter(requireContext(), R.layout.chicken_store_list_item,mChickenStoreList)
        binding.chickenListView.adapter = mChickenStoreAdapter

    }
}