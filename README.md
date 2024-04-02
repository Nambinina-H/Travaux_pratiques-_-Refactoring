# README.md

## Travaux Pratiques - Refactoring avec Eclipse

Ce projet a été conçu dans le cadre du cours de Génie Logiciel Avancé au sein du Master 1 de l'École Nationale d'Informatique, Fianarantsoa, pour l'année universitaire 2024. L'objectif principal de ces travaux pratiques est d'approfondir les compétences en refactoring, en utilisant les fonctionnalités avancées d'Eclipse et en suivant les modifications à l'aide d'un système de gestion de version comme SVN (Subversion) ou Git.

### Contenu du Projet

Le projet est structuré autour des tâches suivantes, destinées à introduire progressivement les concepts de refactoring :

1. **Initialisation du Projet**: Création d'un nouveau projet Java dans Eclipse.
2. **Structure de Base**: Ajout de packages et de classes initiales (`Homme`, `Femme`, `Humain`).
3. **Héritage et Refactoring**: Modification des classes pour introduire l'héritage et déplacer les attributs et méthodes communs vers la classe parente.
4. **Amélioration de la Conception**: Refactoring du code pour améliorer la lisibilité et la maintenance, notamment par l'extraction de méthodes et l'utilisation de l'héritage.
5. **Utilisation des Interfaces**: Introduction d'une interface pour définir des comportements communs.
6. **Pratiques Avancées de Refactoring**: Exploration de l'impact du déplacement de méthodes spécifiques et de la modification des signatures de méthodes.

### Questions

1. Créez un nouveau projet en Java sur l’Eclipse ;
2. Dans le répertoire source, ajoutez un package iut.bad ;
3. Créez une classe Homme ayant comme champs nom, prenom, age et des constructeurs ;
4. Créez une classe Femme ayant les mêmes champs et des constructeurs ;
5. Créez une classe Humain et modifiez Homme/Femme pour qu'elle soit leur classe parente ;
6. Déplacezles attributs de Homme/Femme pour les placer dans le parent ;
7. Dans la classe Humain, écrivez une méthode details() qui affiche le nom, prénom, et âge en
utilisant un unique System.out.println ;
8. Extrayez les paramètres affichés de la méthode précédente pour les placer dans une méthode
toString() ;
9. Que se passe-t-il si vous voulez déplacer la méthode toString() vers les sous classes ?
10. Ajoutez les méthodes manger() et boire() à la classe Humain ;
11. Déplacez ces méthodes dans une interface Consommation ;
12. Ajoutez une méthode ami(Humain) qui permet d'indiquer une amitié entre 2 humains ;
13. Dans la classe Femme, créez une méthode main() qui instancie un Homme et une Femme, et déclare
que l'un est ami de l'autre ;
14. Modifiez la signature d'ami pour qu'elle prenne un int en paramètre (la durée de l'amitié en jours)
valant 100 par défaut

### Comment Utiliser ce Projet

1. **Clonage du Dépôt**: Commencez par cloner ce dépôt sur votre machine locale pour avoir accès à l'ensemble des fichiers du projet.
2. **Configuration de l'Environnement de Développement**: Importez le projet dans Eclipse et assurez-vous que votre environnement est configuré pour utiliser Java et SVN/Git.
3. **Exploration et Modification**: Suivez les instructions des travaux pratiques pour modifier le code source, en utilisant les fonctionnalités de refactoring d'Eclipse. Utilisez SVN ou Git pour commit vos changements à chaque étape significative.

---
*Ce projet est une composante du cursus académique à l'ENI et est soumis à la licence [MIT](LICENSE). Les contributions et l'utilisation de ce projet à des fins éducatives sont encouragées.*
