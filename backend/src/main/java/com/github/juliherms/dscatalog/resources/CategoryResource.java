package com.github.juliherms.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.juliherms.dscatalog.entities.Category;

/**
 * This class responsible to provide categories API
 * 
 * @author jlv
 *
 */
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = new ArrayList<Category>();
		list.add(new Category(1L, "Book"));
		list.add(new Category(2L, "Foods"));
		return ResponseEntity.ok().body(list);
	}

}
