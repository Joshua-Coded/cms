package com.alana.cms.domain.vo;

import com.alana.cms.domain.models.Category;
import com.alana.cms.domain.models.Tag;
import lombok.Data;

import java.util.Set;

/**
@author Joshua Alana 09/02/24
 */
@Data
public class NewsRequest {
String title;
String content;
Set<Category> categories;
Set<Tag> tags;
}
