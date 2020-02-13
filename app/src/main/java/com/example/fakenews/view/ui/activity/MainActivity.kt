package com.example.fakenews.view.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fakenews.R
import com.example.fakenews.utils.fakeNews
import com.example.fakenews.view.ui.adapter.NewsAdapter
import kotlinx.android.synthetic.main.list_news.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: NewsAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_news)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        viewManager = LinearLayoutManager(this)
        viewAdapter = NewsAdapter(fakeNews())

        recyclerView = recycler.apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}