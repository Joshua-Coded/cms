package com.alana.cms.domain.vo;

import com.alana.cms.domain.models.Role;
import lombok.Data;

/**
 * @author Joshua Alana 09/02/24
 */
@Data
public class UserRequest {
    String name;
    String identity;
    Role role;
}
