package com.start.deliveryorder_20220528.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.start.deliveryorder_20220528.fragments.ChickenStoreListFragment
import com.start.deliveryorder_20220528.fragments.MyProfileFragment
import com.start.deliveryorder_20220528.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "피자 주문"
            1 -> "치킨 주문"
            else -> "내 정보 설정"
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PizzaStoreListFragment()
            1 -> ChickenStoreListFragment()
            else -> MyProfileFragment()
        }
    }
}