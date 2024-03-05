package com.alana.cms.domain.vo;

import com.alana.cms.domain.models.Role;
import lombok.Data;

@Data
public class UserRequest {
    String identity;
    String name;
    Role role;
}
