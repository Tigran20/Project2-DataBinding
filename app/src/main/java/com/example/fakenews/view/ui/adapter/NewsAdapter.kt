package com.example.fakenews.view.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.fakenews.R
import com.example.fakenews.databinding.ItemListNewsBinding
import com.example.fakenews.model.News

class NewsAdapter(private val news: List<News>) :
        RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemListNewsBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_list_news, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(news[position])
    override fun getItemCount() = news.size

    inner class ViewHolder(private val binding: ItemListNewsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: News) {
            binding.item = data

            binding.ivNewsImage.setImageResource(R.drawable.ic_launcher_background)
            binding.tvNewsTitle.text = data.titleName
            binding.tvNewsDescription.text = data.textDescription
        }
    }
}