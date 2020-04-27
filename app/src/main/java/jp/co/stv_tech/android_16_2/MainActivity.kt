package jp.co.stv_tech.android_16_2

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setLogo(R.mipmap.ic_launcher)
        toolbar.setTitle(R.string.toolbar_title)
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.setSubtitle(R.string.toolbar_subtitle)
        toolbar.setSubtitleTextColor(Color.LTGRAY)
        setSupportActionBar(toolbar)
    }
}
