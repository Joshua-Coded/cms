package com.alana.cms.domain.models;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class News {
    String id;
    String title;
    String content;
    User author;

    Set<User> mandatoryReviewer = new HashSet<>();
    Set<Review> reviewers = new HashSet<>();
    Set<Category> categories = new HashSet<>();
    Set<Tag> tags = new HashSet<>();

    public Boolean revised(){
        return this.mandatoryReviewer.stream().allMatch(reviewer -> this.reviewers.stream()
                .anyMatch(review -> reviewer.id.equals(review.userId) && "approved".equals(review.status)));
    }

    public  Review review(String userId, String status){
        final Review review = new Review(userId, status);
        this.reviewers.add(review);
        return review;
    }
}
