package com.api.developpeur.controller;

import com.api.developpeur.model.Developer;
import com.api.developpeur.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeveloperController {

    @Autowired
    public DeveloperService service;

    @PostMapping("developer")
    //http://localhost:8080/developer
    public Developer addDeveloper(@RequestBody Developer developer){
        return service.addDeveloper(developer);
    }

    @GetMapping("developer/language")
    //http://localhost:8080/developer/language?name=nomLanguage
    public List<Developer> findByLanguage(@RequestParam String name){return service.findByLanguageName(name);}

    @PutMapping("developer/{id}")
    public Developer updateDeveloper(@PathVariable Long id, @RequestBody Developer developer){
        return service.updateDeveloper(id, developer);
    }
}

/*
{
    "id": 24,
    "lastName": "bbb",
    "firstName": "bbb",
    "language": [
        {
            "id": 9,
            "name": null,
            "version": null
        },
        {
            "id": 10,
            "name": null,
            "version": null
        }
    ]
}
 */