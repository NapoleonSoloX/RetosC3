package com.example.masterclass3.masterclass3.controlador;

import com.example.masterclass3.masterclass3.entidades.Category;
import com.example.masterclass3.masterclass3.entidades.Score;
import com.example.masterclass3.masterclass3.service.CategoryService;
import com.example.masterclass3.masterclass3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/all")
    public List<Score> getAll(){
        return scoreService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save(@RequestBody Score p){
        return scoreService.save(p);
    }

}