# Système de Paiement d'Impôts avec Spring Boot et Thymeleaf

**Ce projet vise à développer un système de paiement d'impôts en utilisant Spring Boot comme framework backend et Thymeleaf comme moteur de templates pour la partie frontend.**

Fonctionnalités:
- Possibilité de soumettre les déclarations fiscales de régularisation en ligne.
- Automatisation du calcul des montants d'impôts à régulariser.
- Choix offert pour effectuer des paiements en ligne pour les montants à régulariser.
- Conservation d'un historique des déclarations et des paiements pour les contribuables.

## Étapes du Projet
1. Configuration de l'Environnement

Avant de commencer, je me suis assuré que tous les éléments suivants installés sur mon système :

    Java Development Kit (JDK)
    Maven
    Base de données (MySQL)
    IDE préféré (Eclipse)
    Thymeleaf: un moteur de modèles Java côté serveur moderne pour les environnements Web et autonomes
    
2. Configuration et création de la Base de Données

![1](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/092eb246-4bc4-4674-a1ea-f366332868f2)
![2](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/c39755c3-db53-4c37-8b14-5e04dcd1d34f)
![3](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/28e7d223-47d2-4ca1-a864-6ab52e678ff2)

3. Création des Entités
    
![4](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/96261638-c3e5-4ef2-9aea-683dcede17e6)
![5](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/7537d8a2-17fc-4497-bbfe-1e3193b494ee)
![6](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/565ab1af-9ae6-489f-a343-3bd033e792f2)

4. Création des DAO (Data Access Objects)
   
![7](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/1d3d8397-c3ee-4725-a8a3-07154185fd85)
![8](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/6b2f5701-27ea-4f17-a2fd-371e23d1acef)
![9](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/c7ecc6f3-9f57-4d61-8fcd-5ef9508ed26a)

5.Mise en Place de la Couche Service

![10](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/5bafda1e-3cf8-43d7-9299-c34e10b4a2ab)
![11](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/b83da26e-bb78-47d3-ac52-38809c559871)
![12](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/636b64cc-8055-4550-a640-4dfd6d2a3f81)

6. Intégration avec les Contrôleurs
   
![16](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/b9d36b23-dbd4-46f5-8c02-381f027de285)
![17](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/679bc164-73bf-4da7-975f-2d93f148fb57)
![18](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/1296fc23-88dd-4ec3-a43e-2a55ea4153da)

8. Création des Vues Thymeleaf
   
![13](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/58276fcf-b05a-42cf-b3a8-1d1901e9cb4d)
![14](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/545d8980-7fd0-47b1-bd99-d2b30ed52c16)
![15](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/813d6e73-1a6e-4afd-8257-16db9960e891)

9. TESTS
![19](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/5749a89d-fc54-48ac-8592-628089cee788)
![20](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/97d89552-602a-43bf-867d-caab9f79b53b)
![21](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/20094fda-644d-44a3-9004-1ea2e47a0f6c)

## Malheureusement les tests n'ont pas abouti, les erreurs de mapping n'ont pas pu être fixés à temps malgré les tutoriels suivis, en effet j'ai tardivement démarré le projet. Toutefois je le continuerai pour apporter une solution à ce problème, votre aide me sera précieuse.
![last](https://github.com/DezzAuthentic/ExamenRegularisationImpots/assets/115024476/bf881e7e-4ea4-452a-b928-217272529cbd)
