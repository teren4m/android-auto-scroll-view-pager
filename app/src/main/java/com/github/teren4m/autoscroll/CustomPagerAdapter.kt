package com.github.teren4m.autoscroll

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class CustomPagerAdapter(val context: Context, val list: List<Pair<String, Int>>) : PagerAdapter() {

    private val inflater = LayoutInflater.from(context)

    override fun instantiateItem(collection: ViewGroup, position: Int): Any =
            collection.let {
                val view = inflater.inflate(R.layout.item_page, collection, false)
                it.addView(
                        view.apply {
                            setBackgroundColor(list[position].second)
                            findViewById<TextView>(R.id.text).text = list[position].first
                        }
                )
                view
            }

    override fun getCount() = list.size

    override fun destroyItem(collection: ViewGroup, position: Int, view: Any) {
        collection.removeView(view as View)
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean = view === obj

    override fun getPageTitle(position: Int) = "Some title"
}