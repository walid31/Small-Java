# Small-Java
Réalisation d’un mini compilateur pour le langage ‘Small_Java’ Avec l’outil ANTLR.

# I. Motivation
Un compilateur est un programme qui traduit un programme écrit dans un langage source vers un
langage cible en indiquant les erreurs éventuelles que pourrait contenir le programme source. Un
informaticien à peu de chances d’être impliqué dans la réalisation d’un compilateur pour un langage de
programmation majeur.

# Alors pourquoi ce TP ?
La compilation n’est pas limitée à la traduction d’un programme informatique écrit dans un langage de
haut niveau en un programme directement exécutable par une machine, cela peut aussi être :
   - La traduction d’un langage de programmation de haut niveau vers un autre langage de
     programmation de haut niveau.
   - La traduction d’un langage de programmation de bas niveau vers un autre langage de
     programmation de haut niveau. Par exemple pour retrouver le code C à partir d’un code compilé
     (piratage, récupération de vieux logiciels, etc).
   - La traduction d’un langage quelconque vers un autre langage quelconque (i.e. pas forcément de
     programmation) : word vers html, pdf vers ps, etc.
     Ce genre de travail peut très bien être confié à un ingénieur maître de nos jours.
     La compilation se décompose en deux phases :
   - Une phase d’analyse, qui va reconnaître les variables, les instructions, les opérateurs et élaborer la
     structure syntaxique du programme ainsi que certaines propriétés sémantiques.
   - Une phase de synthèse et de production qui devra produire le code cible.
     Dans le cadre de ce projet, nous allons utiliser ANTLR (ANother Tool for Language Recognigtion), est
     un générateur d'analyseurs descendants qui utilise LL(*) pour l’analyse syntaxique.

# II. Description du langage Small_Java
  # II.1 La structure générale
    La structure d’un programme écrit en Small_Java est la suivante :
                  //Importer des bibliothèques
                  Modificateur class_SJ NomDeClasse
                  {
                     //Partie déclarations
                     main_SJ
                     {
                        //Partie instructions
                     }
                  }
               
  # II.2 Importation des bibliothèques
    L’importation des bibliothèques en langage Small_Java se fait selon la syntaxe suivante :
                                      import NomBibiliothèque ;
    Les deux bibliothèques autorisées dans Small_Java sont: Small_Java.lang (pour le type String et pour les
    expressions arithmétiques) et Small_Java.io (pour les opérations d’entrées/sorties).
  # II.3 Les identificateurs
    Un identificateur dans Small_Java est composé d’une suite alphanumérique qui ne dépasse pas 10 caractères. 
    Il doit obligatoirement commencer par une lettre.
  # II.4 Déclaration d’une classe
    Une classe se déclare par le prototype suivant :
    Modificateur class_SJ NomDeClasse   // class_SJ est un mot clé.
      - Un modificateur peut exister ou non. S’il existe il prend une de ces deux valeurs :
        public ou protected.
      - Le nom de la classe est un identificateur qui doit débuter par une majuscule.
  # II.5 Les déclarations
    Nous pouvons déclarer dans ce langage des variables simples comme suit :
    Type NomVariable ;
    Le NomVariable est un identificateur, pour Type est le nom du type de la variable (voir section II.6).
    La déclaration d’un ensemble de variables s’effectue en séparant les noms de variables par ‘,’.
    Exemple : Type NomVariable1, NomVariable2;
  # II.6 Les types
    Le langage Small_Java accepte les types suivants :
      - int_SJ : Un entier est une suite de chiffres.
      - float_SJ : Une valeur réelle est une suite de chiffres contenant le point décimal.
      - string_SJ : Elle représente une chaîne de caractères. Elle doit être placée entre guillemets,
      exemple : ‘‘ ceci est une chaine de caractères de type string_SJ ’’.
  # II.7 Les instructions
    Dans notre langage, seules les instructions suivantes sont autorisées :     
     | Instruction    | Description                | Exemple                               | bibliothèque    |
     |----------------|----------------------------|---------------------------------------|-----------------|
     | Affectation    |    Idf := expression ;     | A := 2 ;                              | Small_Java.lang |
     |                | //Expression peut être     | A := C+D ;                            |                 |
     |                | //arithmétique ou une      | A := ‘‘ Une chaine de caractères ’’ ; |                 |
     |                | //initialisation de        |                                       |                 |
     |                | //valeurs entière, réelle  |                                       |                 |
     |                | //ou chaine de caractères. |                                       |                 | 
     |----------------|----------------------------|---------------------------------------|-----------------|   
     | Instruction    | Si – Alors – Sinon         | Si (term1 > 0) Alors {                |Small_Java.lang  |
     | conditionnelle | // la partie sinon est     |  term2 = term2 + 1 ;                  |                 |
     |                | optionnelle                |  term1 = term1+1 ; }                  |                 | 
     |                |                            | Sinon {term2 = term2 + 2 ;}           |                 | 
     |----------------|----------------------------|---------------------------------------|-----------------|
     |Lecture         | In_SJ( “Signe de           | In_SJ(“%d”, A) ;                      | Small_Java.io   |
     |                | formatage”, idf);          |                                       |                 | 
     |                |                            |                                       |                 | 
     |                | Signe de formatage :       |                                       |                 |
     |                | %d(int_SJ),                |                                       |                 |
     |                | %f(float_SJ),              |                                       |                 |
     |                | %s(string_SJ)              |                                       |                 |
     |----------------|----------------------------|---------------------------------------|-----------------|
     | Ecriture       | Out_SJ(“chaine et signe    | Out_SJ(“la somme est %d”, somme) ;    | Small_Java.io   |
     |                | de formatage”, idf) ;      |                                       |                 |
     |----------------|----------------------------|---------------------------------------|-----------------|
     
  # II.8 Les expressions
    Les expressions peuvent être arithmétiques ou logiques, pour les composer on utilise les opérateurs
    indiqués dans les tableaux suivants : 
    | Opérateurs    | Addition : +           | 1*2 , 3+6 , 2.1-6.5 |
    | arithmétiques | Soustracrion : -       |                     |
    |               | Multiplication : *     |                     |
    |               | Division : /           |                     |
    |---------------|------------------------|---------------------|
    | Opérateurs de | Supérieur : >          | (2 > 1)             |
    | comparaison   | Inférieur : <          | (y = x)             |
    |               | Egal : =               | (z < (1.2))         |  
    |               | Différent : !=         |                     |
    |               | Supérieur ou Egal : >= |                     |
    |               | Inférieur ou Egal : <= |                     |
    |               |                        |                     |
    |---------------|------------------------|---------------------| 
    | Opérateurs    | Le et logique : &      | (x & y)             |
    | logiques      | Le ou logique : |      | ((x > 1) | (x < 5)) |
    |               | La négation : !        | (!(x != y))         |
    |---------------|------------------------|---------------------|  
    
