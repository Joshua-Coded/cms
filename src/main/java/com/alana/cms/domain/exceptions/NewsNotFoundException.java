package com.alana.cms.domain.exceptions;
import lombok.Getter;

/**
 * @author Joshua Alana
 */
@Getter
public class NewsNotFoundException extends RuntimeException{

    private final String id;

    public NewsNotFoundException(String id) {
        this.id = id;
    }

}
