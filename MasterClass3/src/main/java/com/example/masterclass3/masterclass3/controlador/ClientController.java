package com.example.masterclass3.masterclass3.controlador;

import com.example.masterclass3.masterclass3.entidades.Admin;
import com.example.masterclass3.masterclass3.entidades.Category;
import com.example.masterclass3.masterclass3.entidades.Client;
import com.example.masterclass3.masterclass3.service.CategoryService;
import com.example.masterclass3.masterclass3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client p){
        return clientService.save(p);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Client update(@RequestBody Client p){ return clientService.update(p);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable ("id") int id){
        return clientService.delete(id);
    }

}