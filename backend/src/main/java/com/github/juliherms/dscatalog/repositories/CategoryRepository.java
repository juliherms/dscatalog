package com.github.juliherms.dscatalog.repositories;

import com.github.juliherms.dscatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Class responsible to access category table
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {



}
