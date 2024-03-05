package com.alana.cms.domain.vo;

import com.alana.cms.domain.models.Category;
import com.alana.cms.domain.models.Tag;
import lombok.Data;

import java.util.Set;

@Data
public class NewsRequest {
    String title;
    String content;
    Set<Category> categories;
    Set<Tag> tags;
}
