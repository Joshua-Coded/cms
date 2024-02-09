package com.alana.cms.domain.resources;

import com.alana.cms.domain.models.Category;
import com.alana.cms.domain.service.CategoryService;
import com.alana.cms.domain.vo.CategoryRequest;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value = "Find category",notes = "Find the Category by ID")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Category found"),
            @ApiResponse(code = 404,message = "Category not found"),
    })
    public ResponseEntity<Category> findOne(@PathVariable("id") String id){
        return ResponseEntity.ok(new Category());
    }

    @GetMapping
    @ApiOperation(value = "List categories",notes = "List all categories")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Categories found"),
            @ApiResponse(code = 404,message = "Categories not found")
    })
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.ok(this.categoryService.findAll());
    }

    @PostMapping
    @ApiOperation(value = "Create category",notes = "It permits to create a new category")
    @ApiResponses(value = {
            @ApiResponse(code = 201,message = "Category created successfully"),
            @ApiResponse(code = 400,message = "Invalid request")
    })
    public ResponseEntity<Category> newCategory(@RequestBody CategoryRequest category){
        return new ResponseEntity<>(this.categoryService.create(category), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Remove category",notes = "It permits to remove a category")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Category removed successfully"),
            @ApiResponse(code = 404,message = "Category not found")
    })
    public void removeCategory(@PathVariable("id") String id){

    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Update category",notes = "It permits to update a category")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Category update successfully"),
            @ApiResponse(code = 404,message = "Category not found"),
            @ApiResponse(code = 400,message = "Invalid request")
    })
    public ResponseEntity<Category> updateCategory(@PathVariable("id") String id, CategoryRequest category){
        return new ResponseEntity<>(new Category(), HttpStatus.OK);
    }
}