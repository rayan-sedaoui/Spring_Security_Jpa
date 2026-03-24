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


## l'application


<img width="419" height="195" alt="Screenshot 2026-03-23 180811" src="https://github.com/user-attachments/assets/f516f349-5bc2-4a16-89eb-764ef1540e7c" />
<img width="405" height="176" alt="Screenshot 2026-03-23 180825" src="https://github.com/user-attachments/assets/0eabf592-b80a-4618-b98e-27a10a463f23" />
<img width="420" height="219" alt="Screenshot 2026-03-23 180849" src="https://github.com/user-attachments/assets/23bc967d-6af7-4360-9118-540461a8be01" />




## Architecture du tp 


<img width="603" height="925" alt="Screenshot 2026-03-23 195533" src="https://github.com/user-attachments/assets/9ffe5179-b2a4-446a-a97b-cdaeb40b7ea1" />
<img width="602" height="759" alt="Screenshot 2026-03-23 195545" src="https://github.com/user-attachments/assets/95817a5d-f851-4385-aea3-ef626235582d" />



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
