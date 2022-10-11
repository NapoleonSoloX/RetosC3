package com.example.masterclass3.masterclass3.repositorio;

import com.example.masterclass3.masterclass3.entidades.Category;
import com.example.masterclass3.masterclass3.entidades.Score;
import com.example.masterclass3.masterclass3.repositorio.crudRepository.ScoreCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ScoreRepository {
    @Autowired
    private ScoreCrudRepository scoreCrudRepository;

    public List<Score> getAll(){
        return (List<Score>) scoreCrudRepository.findAll();
    }

    public Optional<Score> getScore(int id){
        return scoreCrudRepository.findById(id);
    }

    public Score save(Score c){
        return scoreCrudRepository.save(c);
    }

    public void delete(Score c){
        scoreCrudRepository.delete(c);
    }

}
