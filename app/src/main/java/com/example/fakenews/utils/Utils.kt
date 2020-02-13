package com.example.fakenews.utils

import com.example.fakenews.model.News

fun fakeNews(): List<News> {
    val listOfNews = mutableListOf<News>()
    for (n in 1..30) {
        listOfNews.add(News(n, "Hi $n", "TextDesc"))
    }

    return listOfNews
}
