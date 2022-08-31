package dev.hossen.arif.ui.custome_switch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val switch3 = findViewById<Switch>(R.id.switch3)
        switch3.setSwitchTextAppearance(this, R.style.switchTextAppearance)
    }
}