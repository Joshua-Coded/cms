package com.alana.cms.domain.resources;

import com.alana.cms.domain.models.User;
import com.alana.cms.domain.vo.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author JOSHUA ALANA 09/02/24
 */
@RestController
@RequestMapping("/api/user")
public class UserResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findOne(@PathVariable("id") String id){
        return ResponseEntity.ok(new User());
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(Arrays.asList(new User(), new User()));
    }

    @PostMapping
    public ResponseEntity<User> newUser(UserRequest userRequest){
        return new ResponseEntity<>(new User(), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeUser(@PathVariable("id") String id){}

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") String id, User userRequest){
        return new ResponseEntity<>(new User(), HttpStatus.OK);
    }
}
