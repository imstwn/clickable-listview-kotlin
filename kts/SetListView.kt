package 'your.package.name'

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class SetListView(co:Activity, name:Array<String>, desc:Array<String>, img:Array<Int>): ArrayAdapter<String>(co, R.layout.layout_item, name) {
    lateinit var onItemClickListener: Any
    
    private val cont = co
    private val name = name
    private val desc = desc
    private val img = img
    
    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(pos:Int, view:View?, par:ViewGroup): View {
        val inf = LayoutInflater.from(cont)
        val row = inf.inflate(R.layout.layout_item, null, true)
        
        val nameToDisplay = row.findViewById<TextView>(R.id.nameView)
        val descToDisplay = row.findViewById<TextView>(R.id.descView)
        val imgToDisplay = row.findViewById<ImageView>(R.id.imgView)
        
        nameToDisplay.text = name[pos]
        descToDisplay.text = desc[pos]
        imgToDisplay.setImageResource(img[pos])
        
        return row
    }
}
