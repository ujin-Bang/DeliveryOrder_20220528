package com.start.deliveryorder_20220528.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.start.deliveryorder_20220528.R
import com.start.deliveryorder_20220528.datas.ChickenStoreData

class ChickenStoreAdapter(
    val mContext: Context,
    resId: Int,
    val mList: ArrayList<ChickenStoreData>): ArrayAdapter<ChickenStoreData>(mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.chicken_store_list_item,null)
        }
        val row = tempRow!!

        val data = mList[position]
        val txtStoreName = row.findViewById<TextView>(R.id.txtStoreName)
        val imgLogo = row.findViewById<ImageView>(R.id.imgLogo)

        txtStoreName.text = data.storeName
        Glide.with(mContext).load(data.logoURL).into(imgLogo)


        return row
    }
}