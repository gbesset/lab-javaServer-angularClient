# Basic CRUD App with Spring Boot 2.0 & Angular 5.0


## Components
### Server
* Spring boot 2.0
* API via RestController

### Client
* Angular 5.0
* Angular Material

## Installation
### Local
* lancer le server (springBoot app)
* lancer Angular (ng serve)

### VPS
* Mise en place d'une redirection server.monDomaine.fr vers mon VPS
* Mise en place d'une redirection client.monDomaine.fr vers mon VPS
* Conf nginx
   - Ajout conf server = PROXY via proxy_pass (localhost... ou nom domaine)
   - Ajout conf client (redirection vers repertoire www adéquat)
* déploiement Server (mvn clean install) et App (ng build --prod)


* Lancement server java (java -jar monjar > server.logs &)
* ps aux | grep java.  et kill -p PID
* gestion problèmes CORS (ajout @CrossOrigin sur controllers)

### TODO
problème accès une page quelconque angular -> 404
gestion 404


## Authentification
oAuth a mettre en place



## Links
[based on okta tutorial](https://github.com/oktadeveloper/okta-spring-boot-2-angular-5-example)