package com.github.teren4m.autoscroll

import androidx.viewpager.widget.ViewPager

fun AutoScrollViewPager.rightLeftAutoScroll() {
    addOnPageChangeListener(
            object : ViewPager.OnPageChangeListener {
                override fun onPageScrollStateChanged(state: Int) {
                    toString()
                }

                override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                    toString()
                }

                override fun onPageSelected(position: Int) {
                    when (position) {
                        0 -> direction = AutoScrollViewPager.RIGHT
                        (adapter!!.count - 1) -> direction = AutoScrollViewPager.LEFT
                    }
                }

            }
    )
}