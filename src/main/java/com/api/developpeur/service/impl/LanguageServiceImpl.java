package com.api.developpeur.service.impl;

import com.api.developpeur.model.Language;
import com.api.developpeur.repository.LanguageRepository;
import com.api.developpeur.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    public LanguageRepository repository;

    @Override
    public Language addLanguage(Language language) {
        return repository.save(language);
    }

    @Override
    public Language updateLanguage(Long id, Language language) {
        Language updateLanguage = repository.findById(id).get();
        updateLanguage.setName(language.getName());
        updateLanguage.setVersion(language.getVersion());
        return repository.save(updateLanguage);
    }

}
