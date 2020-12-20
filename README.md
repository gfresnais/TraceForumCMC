# TraceForumCMC
Réalisé par Gallien FRESNAIS et Lilian VALLÉE dans le cadre du cours d'Analyse de données hétérogènes de l'ENSIM (Le Mans, France). Il s'agit d'un mini-moteur de calculs d'indicateurs pour qu'un professeur puisse voir des statistiques concernant des groupes d'étudiants.

Développé avec Java Spring Boot avec les plugins suivants
- Base de données H2
- JPA (Java Persistance API)
- Thymeleaf (templates HTML)
- Webjars
    - Bootstrap CSS
    - jQuery
    - Chart.js

Design patterns employés
- MVC
- Singleton

Insertion des données existantes (data.sql) dans une base de données H2 en mémoire puis interrogation de celle-ci

## Pré-requis pour lancer l'exécutable
- [l'exécutable JAR](https://github.com/gfresnais/TraceForumCMC/releases/download/v1.0/TraceForumCMC-v1.jar)
- Java JRE 11
- Le navigateur internet de votre choix

## Lancement de l'application
- Lancer l'exécutable Java
    - Méthode 1 : double-cliquer dessus (s'exécutera en arrière-plan)
    - Méthode 2 : le lancer via la console de commandes *java -jar TraceForumCMC-v1.jar*
- Ouvrir votre navigateur internet
- Taper dans la barre d'adresse : *localhost:8080*