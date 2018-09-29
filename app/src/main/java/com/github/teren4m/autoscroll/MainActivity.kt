package com.github.teren4m.autoscroll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.github.teren4m.autoscroll.AutoScrollViewPager.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val r = Random()
        val adapter = CustomPagerAdapter(this,
                listOf(
                        "data" to r.nextInt(),
                        "val" to r.nextInt(),
                        "some" to r.nextInt(),
                        "dddd" to r.nextInt(),
                        "drop" to r.nextInt()
                ))
        pager.adapter = adapter
        pager.startAutoScroll()
        pager.isCycle = true
        pager.setAutoScrollDurationFactor(10.0)
        pager.interval = 1000
        pager.rightLeftAutoScroll()
    }
}
