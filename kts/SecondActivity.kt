package 'your.package.name'

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc)
        
        supportActionBar?.setTitle("Imam 5190411202")
        
        val name = findViewById<TextView>(R.id.nameSelected)
        val dob = findViewById<TextView>(R.id.dateSelected)
        val desc = findViewById<TextView>(R.id.descSelected)
        val img = findViewById<ImageView>(R.id.imgSelected)
        
        val bundle = intent.extras
        val the = bundle?.getInt("picture")
        
        if (bundle != null) {
            if (the != null) {
                img.setImageResource(the)
            }
            name.text = intent.getStringExtra("name")
            dob.text = intent.getStringExtra("dob")
            desc.text = intent.getStringExtra("desc")
        }
    }
}
