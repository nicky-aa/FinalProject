package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ToptenActivity1 : AppCompatActivity() {

    private lateinit var mRecyclerView: RecyclerView
    val items = listOf(
            "1.Leo王",
            "2.ØZI",
            "3.蛋堡 (Soft Lipa)",
            "4.POPO J",
            "5.國蛋 GorDoN",
            "6.春艷",
            "7.呂士軒 (TroutFresh)",
            "8.熊仔 (Kumachan)",
            "9.陳嫺靜",
            "10.MC HotDog熱狗"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topten1)
        mRecyclerView = findViewById(R.id.recyclerView)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = TR1Adapter(items, this)
        mRecyclerView.addItemDecoration( DividerItemDecoration( this, DividerItemDecoration.VERTICAL))
    }
}