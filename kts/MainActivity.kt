package 'your.package.name'

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val names = arrayOf("Nayeon", "Jeongyeon", "Momo", "Sana", "Jihyo", "Mina", "Dahyun", "Chaeyoung", "Tzuyu")
        
        val dob = arrayOf(
            "22 September 1995",
            "1 November 1996",
            "9 November 1996",
            "29 December 1996",
            "1 February 1997",
            "24 March 1997",
            "28 May 1998",
            "23 April 1999",
            "14 June 1999")
        
        val images = arrayOf(
            R.drawable.ny,
            R.drawable.jy,
            R.drawable.mm,
            R.drawable.sn,
            R.drawable.jh,
            R.drawable.mn,
            R.drawable.dh,
            R.drawable.cy,
            R.drawable.tz)
        
        val desc = arrayOf(
            "There are one of those days Days when I suddenly feel all alone
            When I feel like I don’t belong anywhere And my head is hanging down",
            "Whenever those days come You tell me how precious I am All those
            words you say From nobody to somebody I become a very special me",
            "You make me feel special No matter how the world brings me down
            Even when hurtful words stab me I smile again 'cause you're there",
            "That's what you do Again I feel special One moment I feel like
            I’m nothing at all Like no one would notice if I were gone",
            "But then when I hear you calling me I feel loved, I feel so
            special I just wanted to hide Didn’t wanna face the world",
            "As if everything has lost meaning As if I have lost meaning I
            just sat there still Then you appeared before me",
            "With a warm smile, you held out your hand Everything’s alright
            From nobody to somebody I become a very special me",
            "You make me feel special No matter how the world brings me down
            Even when hurtful words stab me I smile again 'cause you're there",
            "That's what you do Again I feel special One moment I feel like
            I’m nothing at all Like no one would notice if I were gone")
            
        val listLay = findViewById<ListView>(R.id.csListView)
        val list = SetListView(this, names, dob, images)
        
        listLay.adapter = list
        listLay.isClickable = true
            
        listLay.onItemClickListener = AdapterView.OnItemClickListener {
            parent, _, position, _ ->
            val selected = parent.getItemAtPosition(position)
            val intent = Intent(this, SecondActivity::class.java)
            
            intent.putExtra("name", selected.toString())
            intent.putExtra("dob", dob[position])
            intent.putExtra("picture", images[position])
            intent.putExtra("desc", desc[position])
            
            startActivity(intent)
        }
    }
}
