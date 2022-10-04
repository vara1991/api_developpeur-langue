package com.api.developpeur.service;

import com.api.developpeur.model.Language;

public interface LanguageService {

    public Language addLanguage(Language language);
    public Language updateLanguage (Long id, Language language);
}
