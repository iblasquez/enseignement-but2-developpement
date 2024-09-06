# BUT2 : Qualité de développement (R3.04) : le produit correctement développé (*the right product*) 
## Conception et Programmation Orientée Objet Avancées

*Ce module fait suite aux ressources Développement Orienté Objet (R2.01) & Qualité (R2.03) de première année du BUT Informatique (https://github.com/iblasquez/enseignement-but1-developpement)* 

Dans ce dépôt, vous trouverez les rubriques suivantes :

- [Supports de cours](#cours)
- [Exposés sur les Patterns](#expose)
- [Aides mémoires (Cheat sheet)](#cheatsheet)  
- [Enoncés TP](#tp)
- [Ressources complémentaires](#ressources)  


## Supports de cours <a id="cours"></a>

- [Doublures de test](./cours/TestDouble_Mockito.pdf) 
- [Ecrire du code SOLID](./cours/SOLID.pdf)  
- [Quid de la documentation ?](./cours/QuidDocumentation.pdf)  



## Exposés sur les Patterns <a id="expose"></a>

- [Présentations de quelques patterns et autres notions avancées de conception logicielle (travaux réalisés par les étudiants depuis 2024)](https://github.com/iblasquez/but2-presentations-r304)

- [Quelques références autour des Design Patterns](https://github.com/iblasquez/but2-presentations-r304/blob/main/ressources/references_patterns.md)


## Aides mémoires (Cheat sheet)<a id="cheatsheet"></a>

- ...  à venir ....



## Enoncés de TP <a id="tp"></a>


- **Pré-requis** : **Installation d'un JDK dans votre environnement de développement**
	- **Avez-vous une version du JDK d'installer sur votre machine ?**  
Pour en savoir plus, regardez la vidéo suivante [Installer un poste de développement Java](https://www.youtube.com/watch?v=Kd8UC18rw6M)   
Attention depuis juillet 2021, **adoptopenjdk.net** a migré vers [adoptium.net](https://adoptium.net).  
Vous pouvez également récupérer des versions du jdk sur [jdk.java.net](https://jdk.java.net) (choisir Ready for use). 

	- Que se passe-t-il si vous exécutez la commande "**java - version**" dans une invite de commande ?  
La version du jdk qui a été paramétré dans votre variable d'environnement JAVA_HOME doit s'afficher. Si ce n'est pas le cas, rendez-vous [ici](https://github.com/iblasquez/Back2Basics_Developpement) et plus particulièrement le lien [wikiHow to Set Java Home](https://www.wikihow.com/Set-Java-Home).


- **Tous vos TP doivent être versionnés !**

	- TP n° 1 (inspiration **[Kata Tennis](https://github.com/emilybache/Tennis-Refactoring-Kata)**) :  
[Mise en place de bonnes pratiques de développement autour du refactoring du Kata Tennis](./TP/R3_04/R3_04_BonnesPratiques_KataTennis.pdf) 

	- TP n°2 : (doublure de tests)  
[Prise en main des doublures de test et de Mockito](./TP/R3_04/R3_04_Mockito_PriseEnMain.pdf) également [en ligne sur le dépôt iblasquez/tuto_mockito](https://github.com/iblasquez/tuto_mockito)


	- TP n° 3 (inspiration  **[Kata Racing Car](https://github.com/emilybache/Racing-Car-Katas)**) :  
[En route pour l’écriture d'un code plus propre et plus SOLID - Kata Car Racing : tirePressureMonitoringSystem ](./TP/R3_04/R3_04_SOLID_Kata_Car_Racing.pdf)  


	- TP n° 4 (inspiration  **[Kata Parrot](https://github.com/emilybache/Parrot-Refactoring-Kata)** - OCP/DIP) :  
[Kata Parrot (guidé) ](./TP/R3_04/R3_04_SOLID_Polymorphism_KataParrot.pdf) 


	- TP n° 5 (S.O.L.I.D) :     
[Une SOLIDe revue de code](./TP/R3_04/R3_04_SOLID_Revue.pdf)  


	- TP n° 6 (inspiration  **[Kata Racing Car](https://github.com/emilybache/Racing-Car-Katas)** - SRP/Test Data Builder)   
[Kata Car Racing : le retour ! Encore plus SOLID et clean ! ](./TP/R3_04/R3_04_CarRacing_SRP_CleanTest_Builder.pdf)  


	- TP n° 7 (inspiration  **[Kata Kebab](https://github.com/malk/the-kebab-kata)** & pattern Visiteur) :  
[Kata Kebab à notre sauce : visitons les kébabs !](./TP/R3_04/R3_04_KataKebab_SauceVisiteur.pdf)    



	- TP n° 8 (pattern Chaine de responsabilité : CoR) :   
[A la découverte du pattern Chaîne de Responsabilité](./TP/R3_04/R3_04_CoR_ATM.pdf)  



	- TP n° 9 (kata pour s'entraîner) :   
[Kata Mars Rover](./TP/R3_04/R3_04_MarsRover.pdf)  


	- TP n° 10 (pattern Composite) :  
[Au menu : un composite toulousain-limousin ! avec un zeste de diagramme objets](./TP/R3_04/R3_04_Composite.pdf)  
 


## Ressources complémentaires <a id="ressources"></a>

### Références autour des doublures de test

- [Mock Roles, not Objects](http://www.jmock.org/oopsla2004.pdf) de Steve Freeman, Nat Pryce, Tim Mackinnon, Joe Walnes (OOPSLA 2004)
- [Mocks Aren't Stubs](https://martinfowler.com/articles/mocksArentStubs.html) sur le blog de Martin Fowler
- <img src="http://xunitpatterns.com/Cover-Small.gif" alt="xUnit Patterns" width="70"> [xUnit Test Patterns](https://www.amazon.com/xUnit-Test-Patterns-Refactoring-Code/dp/0131495054) de Gerard Meszaros(rubrique TestDouble en ligne [ici](http://xunitpatterns.com/Test%20Double.html)) 
- <img src="http://www.growing-object-oriented-software.com/cover.jpg" alt="GOOS" width="70"> [Growing Object-Oriented Software Guided by Tests](http://www.growing-object-oriented-software.com) de Steve Freeman and Nat Pryce 

... mais aussi [***Doublures en Folie***](http://agilitateur.azeau.com/public/doublures-en-folie/doublures-en-folie.v1.html), la saynète imaginée par [Olivier Azeau](https://twitter.com/oaz) (teasing [ici](https://www.youtube.com/watch?v=5gkmE0lfkrs))




Licence
-------

Tous ces supports sont placés sous licence CC BY-NC-SA :  [Creative Commons
Attribution - Pas d'Utilisation Commerciale - Partage dans les Mêmes Conditions](https://creativecommons.org/licenses/by-nc-sa/4.0/)

<img src="https://licensebuttons.net/l/by-nc-sa/3.0/88x31.png" width="100">

En savoir plus sur [les licences Creative Commons](https://creativecommons.org/licenses/?lang=fr-FR) ...

Toutefois, toute personne enseignant au département Informatique de l'IUT du Limousin souhaitant utiliser ces documents doit demander une autorisation préalable :smile:






