# PetStore Project Exam

## Description

PetStore est une application Java EE utilisant JPA et Hibernate pour gérer une animalerie. L'application permet de gérer des entités telles que des produits, des animaux, des magasins d'animaux et des adresses. Elle utilise H2 en tant que base de données embarquée pour le stockage des données. Des applications comme HeidiSQL sont utilisés pour faciliter la vision de la BDD et l'utiliser.

## But du Projet

L'objectif de ce projet est de démontrer l'utilisation de Java EE et Hibernate pour la gestion des entités et des relations entre elles dans une application d'animalerie. Le projet met en œuvre différentes entités avec des relations One-to-Many, Many-to-One et l'utilisation d'énumérations.

## Auteur
BAUDIER Bastien

## Installation

1. Clonez le dépôt :

   ```sh
   git clone https://github.com/votre-utilisateur/petstore.git
   cd petstore
   ```
2. Importez le projet dans votre IDE préféré (par exemple, IntelliJ IDEA).

3. Assurez-vous que vous avez Java 8 (ou une version ultérieure) et Maven installés.

4. Mettez à jour les dépendances Maven :

## Utilisation

Configurez le fichier persistence.xml pour vous connecter à la base de données H2. Le fichier de configuration est situé dans src/main/resources/META-INF/persistence.xml.

Exécutez la classe TestJPA pour tester la configuration et créer des exemples d'entités.

Utilisez HeidiSQL ou tout autre client SQL pour vous connecter à la base de données H2 et visualiser les données.

Entités
Le projet inclut les entités suivantes :

Address : Représente l'adresse des magasins d'animaux.
Animal : Classe abstraite représentant un animal avec des sous-classes spécifiques comme Cat et Fish.
PetStore : Représente un magasin d'animaux.
Product : Représente un produit vendu dans le magasin.
Enums
Le projet utilise deux énumérations :

FishLivEnv : Enum pour l'environnement de vie des poissons (FRESH_WATER, SEA_WATER).
ProdType : Enum pour le type de produit (FOOD, ACCESSORY, CLEANING).
Relations
One-to-Many : Un PetStore peut avoir plusieurs Product et Animal.
Many-to-One : Plusieurs Product et Animal peuvent appartenir à un PetStore.
One-to-One : Un PetStore a une Address.

