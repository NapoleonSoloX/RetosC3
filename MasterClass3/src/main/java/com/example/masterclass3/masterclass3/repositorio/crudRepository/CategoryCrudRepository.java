package com.example.masterclass3.masterclass3.repositorio.crudRepository;

import com.example.masterclass3.masterclass3.entidades.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}
