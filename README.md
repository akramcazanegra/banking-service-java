# Skypay Technical Test - Banking Service (Test 1)

Ce dépôt contient mon implémentation pour le test technique Skypay concernant le service bancaire.

## Exigences Implémentées

* Implémentation des fonctions `deposit`, `withdraw`, et `printStatement` dans la classe `Account`.
* La classe `Account` implémente l'interface `AccountService`.
* Gestion du solde et enregistrement des transactions.
* Affichage du relevé (statement) des transactions du plus récent au plus ancien.
* Gestion des exceptions pour les montants invalides (<= 0) ou les retraits supérieurs au solde.

## Comment Exécuter

1.  Assurez-vous d'avoir Java (JDK) installé.
2.  Dans le terminal, naviguez vers le répertoire du projet.
3.  Compilez tous les fichiers :
   
    javac *.java
   
4.  Exécutez la classe principale (Main) :
 
    java Main
   

## Résultat Attendue

L'exécution doit produire le relevé bancaire suivant, correspondant au cas de test fourni :

Date || Amount || Balance 14/01/2012 || -500 || 2500 13/01/2012 || 2000 || 3000 10/01/2012 || 1000 || 1000
