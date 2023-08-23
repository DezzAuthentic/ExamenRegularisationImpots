package com.groupeisi.RegularisationImpots.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupeisi.RegularisationImpots.entities.Declarant;

import java.util.List;

@Repository
public interface DeclarantRepository extends JpaRepository<Declarant, Long> {
    // Méthode pour rechercher des déclarants par adresse
    List<Declarant> findByAdresse(String adresse);

    // Méthode pour rechercher des déclarants par email
    Declarant findByEmail(String email);

    // Méthode pour rechercher des déclarants par numéro de téléphone
    List<Declarant> findByTelephone(String telephone);

    // Méthode pour rechercher des déclarants par raison sociale contenant un mot-clé
    List<Declarant> findByRaisonSocialeContaining(String keyword);
}
