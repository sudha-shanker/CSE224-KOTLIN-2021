package com.example.cse224_kotlin_2021

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView

open class ImageAdapter(private val mContext: Context) : BaseAdapter()
{

    override fun getCount(): Int { return thumbImages.size  }

    override fun getItem(position: Int): Any? {  return null }

    override fun getItemId(position: Int): Long { return 0   }

    // create a new ImageView for each item referenced by the Adapter

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView = ImageView(mContext)
        imageView.layoutParams = AbsListView.LayoutParams(200, 200)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.setPadding(8, 8, 8, 8)
        imageView.setImageResource(thumbImages[position])
        return imageView
    }

    var thumbImages = arrayOf(
        R.drawable.img_1, R.drawable.img_2,
        R.drawable.img_3, R.drawable.img_4,
        R.drawable.img_5, R.drawable.img_6,
        R.drawable.img_7, R.drawable.img_8,
        R.drawable.img_9, R.drawable.img_10,
        R.drawable.img_11, R.drawable.img_12,
        R.drawable.img_13, R.drawable.img_14,
        R.drawable.img_15, R.drawable.img_16,
        R.drawable.img_1, R.drawable.img_2,
        R.drawable.img_3, R.drawable.img_4,
        R.drawable.img_5
    )

}
