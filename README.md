# Spring Boot Security JPA - Authentification & Autorisation

Ce projet est une application web développée avec **Spring Boot**, démontrant une implémentation complète et sécurisée de **Spring Security** couplée à **Spring Data JPA**. Il permet de gérer l'authentification des utilisateurs et leurs rôles directement depuis une base de données MySQL.

## Fonctionnalités principales

* **Authentification en base de données :** Les utilisateurs sont vérifiés par rapport aux données stockées dans MySQL (via Spring Data JPA).
* **Sécurité des mots de passe :** Utilisation de l'algorithme `BCryptPasswordEncoder` pour hacher et sécuriser les mots de passe.
* **Gestion des rôles :** Attribution de rôles multiples dynamiques (`ROLE_ADMIN`, `ROLE_USER`).
* **Interface personnalisée :** * Page de connexion (`/login`) construite sur mesure avec HTML/CSS.
    * Gestion de la déconnexion avec message de confirmation.
* **Rendu dynamique avec Thymeleaf :** Affichage personnalisé sur la page d'accueil en fonction de l'utilisateur connecté et de ses rôles (via `thymeleaf-extras-springsecurity`).
* **Initialisation automatique :** Création automatique des tables (Hibernate) et insertion d'utilisateurs par défaut au démarrage grâce à un `CommandLineRunner`.

## Technologies utilisées

* **Java 17**
* **Spring Boot 3.5.x**
* **Spring Security 6.x**
* **Spring Data JPA / Hibernate**
* **MySQL Database** (Driver 9.x)
* **Thymeleaf** (Template engine)
* **Maven** (Gestionnaire de dépendances)

## Prérequis et Configuration

Pour faire tourner ce projet sur votre machine, vous aurez besoin de :
1. **Java 17** ou supérieur installé.
2. **MySQL Server** actif sur le port `3306`.
3. Créer une base de données nommée `security_db` dans MySQL.

<img width="1546" height="550" alt="Screenshot 2026-03-23 183547" src="https://github.com/user-attachments/assets/00286e42-d283-432f-be7e-94b20023298a" />
