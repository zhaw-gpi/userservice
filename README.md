# User Service (user-service)

> Autoren der Dokumentation: Björn Scheppler

> Dokumentation letztmals aktualisiert: 30.12.2018

**Maven-Projekt** für einen simulierten **LDAP**-Service, zugreifbar über **REST**. Übergibt man ihm einen Benutzernamen erhält man ein User-Objekt zurück.

Dieses Projekt wird verwendet im [**Twitter Review Extended**-Projekt](https://github.com/zhaw-gpi/twitter-review-prozess). Erarbeitet am [**Institut für Wirtschaftsinformatik** an der ZHAW School of Management and Law](http://www.zhaw.ch/iwi) im Rahmen des [Bachelor-Studiengangs Wirtschaftsinformatik](https://www.zhaw.ch/de/sml/studium/bachelor/wirtschaftsinformatik/) im [**Modul Geschäftsprozessintegration**](https://modulmanagement.sml.zhaw.ch/StaticModDescAblage/Modulbeschreibung_w.BA.XX.2GPI-WIN.XX.pdf).

## Dokumentation
Um dieses Projekt nachzubauen, ist Kapitel 9.2 in der Schritt-für-Schritt-Anleitung zu nutzen im Ordner \src\docs des [**Twitter Review Extended**-Projekt](https://github.com/zhaw-gpi/twitter-review-prozess).

## Komponenten / Funktionalität
1. **Spring Boot**-Applikation mit Tomcat Server, usw.
2. **Persistierung**skomponenten:
    1. **H2**-Datenbank
    2. User-**Entity**
    3. User-**JPA-Repository**
3. **RESTController**:
    1. basierend auf **Spring Boot Starter Web** RestController-Klasse
    2. Mit einer einzigen **Get-Methode** /userapi/v1/users/{userName}

## Deployment
1. **Erstmalig** oder bei Problemen ein **Clean & Build (Netbeans)**, respektive `mvn clean install` (Cmd) durchführen
2. Bei Änderungen am POM-File oder bei **(Neu)kompilierungsbedarf** genügt ein **Build (Netbeans)**, respektive `mvn install`
3. Damit im Twitter Review Extended die Mails an eine sinnvolle **Mail-Adresse** gesendet werden, in \src\main\resources\data.sql die Mail-Adresse ersetzen.

## Nutzung
### Normal
1. Für den **Start** ist ein **Run (Netbeans)**, respektive `java -jar .\target\NAME DES JAR-FILES.jar` (Cmd) erforderlich.
2. Beim Starten werden die **Insert-Statements** in src\main\ressources\data.sql ausgeführt.
3. Im Browser oder einem sonstigen **REST-Client** (z.B. soapUI) die URL http://localhost:TOMCAT_PORT/userapi/v1/users/a eingeben, um das USER-Objekt als JSON zu erhalten.
4. Oder diesen Service nutzen über das [**Twitter Review Extended**-Projekt](https://github.com/zhaw-gpi/twitter-review-prozess)
3. Das **Beenden** geschieht mit **Stop Build/Run (Netbeans)**, respektive **CTRL+C** (Cmd)

### Fortgeschrittene Nutzung (Datenbank-Konsole)
1. Um auf die Datenbankverwaltungs-Umgebung zuzugreifen, http://localhost:TOMCAT_PORT/console eingeben.
2. Anmeldung über:
    1. Benutzername sa
    2. Passwort: leer lassen
    3. URL jdbc:h2:./DATENBANKNAME_GEMAESS_APPLICATION.PROPERTIES