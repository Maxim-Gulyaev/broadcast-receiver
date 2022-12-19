package android.maxim.br2

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var TAG = "My Receiver"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val broadcastMessage = getString(R.string.broadcast_message)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(TAG)
                .putExtra("message", broadcastMessage)
            sendBroadcast(intent)
        }

        val myReceiver = MyReceiver()
        val intentFilter = IntentFilter(TAG)
        registerReceiver(myReceiver, intentFilter)
    }
}