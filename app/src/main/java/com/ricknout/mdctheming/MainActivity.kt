package com.ricknout.mdctheming

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ricknout.mdctheming.bottomappbar.BottomAppBarActivity
import com.ricknout.mdctheming.theming.ThemingActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        themingPlaygroundButton.setOnClickListener {
            startActivity(Intent(this, ThemingActivity::class.java))
        }
        bottomAppBarPlaygroundButton.setOnClickListener {
            startActivity(Intent(this, BottomAppBarActivity::class.java))
        }
    }
}
