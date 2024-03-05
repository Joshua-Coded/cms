package com.alana.cms.domain.models;

import lombok.Data;

/**
 * @author  Joshua Alana
 */
@Data
public class User {
    String id;
    String identity;
    String name;
    Role role;
}
