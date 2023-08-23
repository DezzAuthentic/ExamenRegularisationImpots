package com.groupeisi.RegularisationImpots.services;

import com.groupeisi.RegularisationImpots.Exception.DeclarantNotFoundException;
import com.groupeisi.RegularisationImpots.dao.DeclarantRepository;
import com.groupeisi.RegularisationImpots.entities.Declarant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeclarantService {
    @Autowired
    private DeclarantRepository declarantRepository;

    public Declarant addDeclarant(Declarant declarant) {
        return declarantRepository.save(declarant);
    }

    public List<Declarant> getAllDeclarants() {
        return declarantRepository.findAll();
    }

    public Declarant getDeclarantById(Long id) throws ChangeSetPersister.NotFoundException {
        Optional<Declarant> optionalDeclarant = declarantRepository.findById(id);
        if (optionalDeclarant.isPresent()) {
            return optionalDeclarant.get();
        } else {
            throw new DeclarantNotFoundException("Déclarant introuvable avec l'ID : " + id);
        }

    }
}
