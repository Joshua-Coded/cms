package com.alana.cms.domain.repository;

import com.alana.cms.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface UserRepository extends JpaRepository<User, String> {

}
