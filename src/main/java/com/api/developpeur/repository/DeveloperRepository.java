package com.api.developpeur.repository;

import com.api.developpeur.model.Developer;
import com.api.developpeur.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    public List<Developer> findByLanguageName(String name);
}
