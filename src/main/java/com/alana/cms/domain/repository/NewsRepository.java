package com.alana.cms.domain.repository;

/**
 * @author Joshua Alana
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.alana.cms.domain.models.News;

public interface NewsRepository extends JpaRepository<News, String> {

}
