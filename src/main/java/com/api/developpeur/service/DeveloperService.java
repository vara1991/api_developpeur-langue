package com.api.developpeur.service;

import com.api.developpeur.model.Developer;
import com.api.developpeur.model.Language;

import java.util.List;

public interface DeveloperService {
    public Developer addDeveloper(Developer developer);
    public List<Developer> findByLanguageName(String name);

    public Developer updateDeveloper(Long id, Developer developer);
}
