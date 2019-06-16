# Progetto 1D per l'A.A. 2018/2019

## Componenti eseguibili

L'applicazione è formata dai seguenti componenti: 

* **eureka_server** è il servizio di service discovery (Eureka)
* **servizio_c** è il servizio che espone due metodi:
  * /animals in POST, che riceve in input una stringa formata da **nome_istanza**:**nome_animale** e salva i dati su un In Memory Database (H2)
  * /animals in GET, che torna una stringa formata dal nome dell'istanza del servizio_c che la riceve seguita dall'insieme di informazione salvate sul database (nome_istanza:nome_animale)
* **servizio_a** è il servizio che espone due metodi:
  * /animals in POST, che crea una stringa formata dal nome dell'istanza del servizio_a che riceve la chiamata e un animale preso casualmente da una lista in memoria, e la invia al servizio_c in POST tramite una chiamata rest al path /animals
  * /animals in GET, che invoca tramite una chiamata rest in GET il servizio_c al path /animals e ritorna la stringa che il servizio_c torna
* **zuul_gateway** è l'API gateway per esporre le funzionalità dell'intera applicazione sulla porta *8080*. In particolare smista tutte le chiamate con /api/asw2019/ verso le istanze del servizio_a

## Ambiente di esecuzione 

Questa applicazione può essere costruita ed eseguita in un ambiente che abbia docker e docker-compose installati.
Vanno però utilizzate più finestre (terminali) diverse. In genere, una per l'applicazione ed una per i suoi client.  

## Build (Java) 

Per la costruzione dell'applicazione eseguire lo script `build-java-projects.sh`

## Build (Docker) 

Per la costruzione delle immagini Docker, eseguire lo script `build-docker-images-with-compose.sh` 

## Esecuzione 

Per eseguire l'applicazione, eseguire lo script `run-with-compose.sh` 

L'applicazione espone i servizi (uno in GET e uno in POST) all'url `localhost:8080/api/asw2019/animals`.

In pratica, l'applicazione può essere verificata usando gli script `run-curl-client-get.sh` e `run-curl-client-post.sh`, i quali eseguono 5 chiamate all'url sopra indicato rispettivamente in GET e in POST. 

## Arresto 

Per arrestare l'applicazione, eseguire lo script `stop-with-compose.sh` 

