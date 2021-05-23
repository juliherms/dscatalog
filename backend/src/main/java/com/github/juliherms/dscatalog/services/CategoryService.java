package com.github.juliherms.dscatalog.services;

import com.github.juliherms.dscatalog.dtos.CategoryDTO;
import com.github.juliherms.dscatalog.entities.Category;
import com.github.juliherms.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class responsible to implement business logic about category
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    /**
     * Method responsible to list all categories
     * @return
     */
    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){
        return repo.findAll().stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
    }
}
