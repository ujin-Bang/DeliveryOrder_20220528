package com.start.deliveryorder_20220528.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.start.deliveryorder_20220528.R
import com.start.deliveryorder_20220528.datas.StoreData

class PizzaStoreAdapter(
    val mContext: Context,
    resId: Int,
    val mList: ArrayList<StoreData>): ArrayAdapter<StoreData>(mContext, resId, mList) {

        val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if ( tempRow == null ) {
            tempRow = mInflater.inflate(R.layout.store_list_item, null)
        }
        val row = tempRow!!

        val data = mList[position]

        val imgLogo = row.findViewById<ImageView>(R.id.imgLogo)
        val txtStoreName = row.findViewById<TextView>(R.id.txtStoreName)




        return row
    }
}