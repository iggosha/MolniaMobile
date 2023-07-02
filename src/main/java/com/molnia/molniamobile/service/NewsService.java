package com.molnia.molniamobile.service;

import com.molnia.molniamobile.model.News;
import com.molnia.molniamobile.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public List<News> findAll() {
        return newsRepository.findAll();
    }

    public News findById(int id) {
        return newsRepository.findById(id).orElse(null);
    }
}
