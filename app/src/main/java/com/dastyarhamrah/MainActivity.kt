
package com.dastyarhamrah

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(245, 247, 250))
        }

        val title = TextView(this).apply {
            text = "دستیار همراه"
            textSize = 28f
            setTextColor(Color.rgb(25, 75, 130))
            gravity = Gravity.CENTER
        }

        val description = TextView(this).apply {
            text = "دستیار صوتی فارسی شما\n\nنسخه اولیه برنامه"
            textSize = 18f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 24, 0, 24)
        }

        layout.addView(title)
        layout.addView(description)
        setContentView(layout)
    }
}
