package com.api.developpeur.controller;

import com.api.developpeur.model.Language;
import com.api.developpeur.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LanguageController {

    @Autowired
    public LanguageService service;

    @PostMapping("language")
    //http://localhost:8080/language
    public Language addLanguage(@RequestBody Language language){
        return  service.addLanguage(language);
    }

    @PutMapping("language/{id}")
    //http://localhost:8080/language/2
    public Language updateLanguage(@PathVariable Long id, @RequestBody Language language){
        return service.updateLanguage(id, language);
    }

}
