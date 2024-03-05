package com.alana.cms.domain.models;

import lombok.Data;

import java.util.Set;

/**
 * @author Joshua Alana
 */
@Data
public class News {
    String id;
    String title;
    String content;
    User author;

    Set<User> mandatoryReviewers;
    Set<Review> reviewers;
    Set<Category> categories;
    Set<Tag> tags;
}
