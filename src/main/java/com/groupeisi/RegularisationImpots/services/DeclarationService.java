package com.groupeisi.RegularisationImpots.services;

import com.groupeisi.RegularisationImpots.dao.DeclarationRepository;
import com.groupeisi.RegularisationImpots.entities.Declaration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclarationService {
    @Autowired
    private DeclarationRepository declarationRepository;

    public Declaration addDeclaration(Declaration declaration) {
        return declarationRepository.save(declaration);
    }

    public List<Declaration> getAllDeclarations() {
        return declarationRepository.findAll();
    }
}
