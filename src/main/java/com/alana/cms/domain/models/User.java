package com.alana.cms.domain.models;

import lombok.Data;

/**
 * @author Joshua Alana 9/02/24
 */
@Data
public class User {
    String id;
    String name;
    String identity;
    Role role;
}