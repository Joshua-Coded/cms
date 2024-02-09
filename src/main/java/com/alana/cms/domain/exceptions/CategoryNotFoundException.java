package com.alana.cms.domain.exceptions;

import lombok.Getter;

/**
 * @author Joshua Alana
 */
@Getter
public class CategoryNotFoundException extends RuntimeException{

    private final String id;

    public CategoryNotFoundException(String id) {
        this.id = id;
    }

}