package com.alana.cms.domain.exceptions;

import lombok.Getter;

/**
 * @author Joshua Alana
 */
@Getter
public class UserNotFoundException extends RuntimeException{

    private final String id;

    public UserNotFoundException(String id) {
        this.id = id;
    }

}
