package com.example.masterclass3.masterclass3.repositorio;

import com.example.masterclass3.masterclass3.entidades.Category;
import com.example.masterclass3.masterclass3.repositorio.crudRepository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }

    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    public Category save(Category c){
        return categoryCrudRepository.save(c);
    }

    public void delete(Category c){
        categoryCrudRepository.delete(c);
    }

}
