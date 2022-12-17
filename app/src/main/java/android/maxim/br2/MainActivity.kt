package android.maxim.br2

import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private var STROKA = "STROKA"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(STROKA)
            sendBroadcast(intent)
        }

        val my_receiver = MyReceiver()
        val intent_filter = IntentFilter(STROKA)
        registerReceiver(my_receiver, intent_filter)
    }
}