package com.example.finalproject

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.fragments.LearningFragment

class MainAdapter(val items: List<String>, var context: Context) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
        holder.textView.setOnClickListener {
            //Toast.makeText(context, holder.textView.text, Toast.LENGTH_SHORT).show()
            if (holder.textView.text == items[0]){
                val intent = Intent(context, ItemActivity0::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[1]){
                val intent = Intent(context, ItemActivity1::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[2]){
                val intent = Intent(context, ItemActivity2::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[3]){
                val intent = Intent(context, ItemActivity3::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[4]){
                val intent = Intent(context, ItemActivity4::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[5]){
                val intent = Intent(context, ItemActivity5::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[6]){
                val intent = Intent(context, ItemActivity6::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[7]){
                val intent = Intent(context, ItemActivity7::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[8]){
                val intent = Intent(context, ItemActivity8::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[9]){
                val intent = Intent(context, ItemActivity9::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[10]){
                val intent = Intent(context, ItemActivity10::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[11]){
                val intent = Intent(context, ItemActivity11::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[12]){
                val intent = Intent(context, ItemActivity12::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[13]){
                val intent = Intent(context, ItemActivity13::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[14]){
                val intent = Intent(context, ItemActivity15::class.java)
                context.startActivity(intent)
            }
        }
    }

    class ViewHolder(val view: View) :  RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.textView)
    }

}