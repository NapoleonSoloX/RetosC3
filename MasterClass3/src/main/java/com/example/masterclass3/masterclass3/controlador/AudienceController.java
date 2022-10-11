package com.example.masterclass3.masterclass3.controlador;

import com.example.masterclass3.masterclass3.entidades.Audience;
import com.example.masterclass3.masterclass3.entidades.Category;
import com.example.masterclass3.masterclass3.service.AudienceService;
import com.example.masterclass3.masterclass3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Audience")
public class AudienceController {

    @Autowired
    private AudienceService audienceService;

    @GetMapping("/all")
    public List<Audience> getAll(){
        return audienceService.getAll();
    }

    @PostMapping("/save")
    public Audience save(@RequestBody Audience p){
        return audienceService.save(p);
    }

}