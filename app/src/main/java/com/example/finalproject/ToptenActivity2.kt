package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ToptenActivity2 : AppCompatActivity() {

    private lateinit var mRecyclerView: RecyclerView
    val items = listOf(
        "1.Eminem",
        "2.J. Cole",
        "3.Logic",
        "4.Post Malone",
        "5.Machine Gun Kelly",
        "6.Tyga",
        "7.NF",
        "8.Wiz Khalifa",
        "9.G-Eazy",
        "10.Macklemore"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topten2)
        mRecyclerView = findViewById(R.id.recyclerView)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = TR2Adapter(items, this)
        mRecyclerView.addItemDecoration( DividerItemDecoration( this, DividerItemDecoration.VERTICAL))
    }
}