package com.alana.cms.domain.resources;

import com.alana.cms.domain.models.Category;
import com.alana.cms.domain.service.CategoryService;
import com.alana.cms.domain.vo.CategoryRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Joshua Alana 09/02/24
 */
@RestController
@RequestMapping("/api/category")
public class CategoryResource {
    private final CategoryService categoryService;
    public CategoryResource(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findOne(@PathVariable("id") String id){
        return ResponseEntity.ok(new Category());
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.ok(this.categoryService.findAll());
    }

    @PostMapping
    public ResponseEntity<Category> newCategory(@RequestBody CategoryRequest category){
        return new ResponseEntity<>(this.categoryService.create(category), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void removeCategory(@PathVariable("id") String id){

    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") String id, CategoryRequest category){
        return new ResponseEntity<>(new Category(), HttpStatus.OK);
    }
}