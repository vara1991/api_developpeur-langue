package com.api.developpeur.service.impl;

import com.api.developpeur.model.Developer;
import com.api.developpeur.model.Language;
import com.api.developpeur.repository.DeveloperRepository;
import com.api.developpeur.repository.LanguageRepository;
import com.api.developpeur.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Autowired
    public DeveloperRepository repository;

    @Autowired
    public LanguageRepository languageRepository;

    @Override
    public Developer addDeveloper(Developer developer) {
        return repository.save(developer);
    }

    @Override
    public List<Developer> findByLanguageName(String name) {
        return repository.findByLanguageName(name);
    }

    @Override
    public Developer updateDeveloper(Long id, Developer developer) {

        Developer updateDeveloper = repository.findById(id).get();
        updateDeveloper.setFirstName(developer.getFirstName());
        updateDeveloper.setLastName(developer.getLastName());

        List<Language> languages = new ArrayList<>();
        developer.getLanguage().forEach(language -> languages.add(languageRepository.findById(language.getId()).get()));

        updateDeveloper.setLanguage(languages);

        return repository.save(updateDeveloper);
    }
}
