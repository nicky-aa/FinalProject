package com.example.finalproject

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.fragments.LearningFragment

class TR1Adapter(val items: List<String>, var context: Context) : RecyclerView.Adapter<TR1Adapter.ViewHolder>() {

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
                val intent = Intent(context, ToptwActivity1::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[1]){
                val intent = Intent(context, ToptwActivity2::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[2]){
                val intent = Intent(context, ToptwActivity3::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[3]){
                val intent = Intent(context, ToptwActivity4::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[4]){
                val intent = Intent(context, ToptwActivity5::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[5]){
                val intent = Intent(context, ToptwActivity6::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[6]){
                val intent = Intent(context, ToptwActivity7::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[7]){
                val intent = Intent(context, ToptwActivity8::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[8]){
                val intent = Intent(context, ToptwActivity9::class.java)
                context.startActivity(intent)
            }
            else if (holder.textView.text == items[9]){
                val intent = Intent(context, ToptwActivity10::class.java)
                context.startActivity(intent)
            }
        }
    }

    class ViewHolder(val view: View) :  RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.textView)
    }

}