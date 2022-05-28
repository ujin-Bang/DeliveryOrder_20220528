package com.start.deliveryorder_20220528.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.start.deliveryorder_20220528.datas.StoreData

class PizzaStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>): ArrayAdapter<StoreData>(mContext, resId, mList) {

}