package com.molnia.molniamobile.repository;

import com.molnia.molniamobile.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {
}
