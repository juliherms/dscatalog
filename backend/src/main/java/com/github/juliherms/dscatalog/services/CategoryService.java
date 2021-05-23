package com.github.juliherms.dscatalog.services;

import com.github.juliherms.dscatalog.entities.Category;
import com.github.juliherms.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class responsible to implement business logic about category
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public List<Category> findAll(){
        return  repo.findAll();
    }
}
