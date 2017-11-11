*******************************************************
* Author : Djebien Tarik                              *
* Object : TP QL - Qualité du logiciel - compte rendu *
* email : tarik.djebien@gmail.com                     *
*******************************************************

**********************************************************************************************************
********************************* CONFIGURATION JAVA *****************************************************
**********************************************************************************************************


Voici les paramètres de configuration pour l'emplacement du fichier texte pour l'application wordcount-business :

- wordcount-parent/wordcount-business/src/main/java/wordcount.xml
- wordcount-parent/wordcount-business/src/test/resources/wordcount.xml

modifier la clé <textPathFile> avec le pathfile de votre fichier texte sur votre système de fichier.

Voici le contenu du fichier texte "test.txt" qui a été utilisé pour ce TP :

"Tarik Djebien Tarik Tarik Tarik Djebien Djebien Tarik"

**********************************************************************************************************

Voici les commandes maven pour généré les binaires, la doc, le war pour l'ensemble des modules :

mvn clean install sur wordcount-parent/pom.xml

********************************************* TRACE ******************************************************

[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for wordcount:wordcount-business:jar:1.0-SNAPSHOT
[WARNING] 'reporting.plugins.plugin.version' for org.codehaus.mojo:cobertura-maven-plugin is missing. @ line 64, column 12
[WARNING] 'reporting.plugins.plugin.version' for org.apache.maven.plugins:maven-checkstyle-plugin is missing. @ line 68, column 12
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for wordcount:wordcount-webapp:war:1.0-SNAPSHOT
[WARNING] The expression ${artifactId} is deprecated. Please use ${project.artifactId} instead.
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Maven
[INFO] wordcount-business
[INFO] wordcount-webapp Maven Webapp
[INFO] palindrome-business
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.4.1:clean (default-clean) @ wordcount-parent ---
[INFO] Deleting /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/target
[INFO] 
[INFO] --- maven-install-plugin:2.3.1:install (default-install) @ wordcount-parent ---
[INFO] Installing /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/pom.xml to /Users/tarik/.m2/repository/wordcount/wordcount-parent/1.0-SNAPSHOT/wordcount-parent-1.0-SNAPSHOT.pom
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building wordcount-business 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[WARNING] The artifact org.apache.commons:commons-io:jar:1.3.2 has been relocated to commons-io:commons-io:jar:1.3.2
[INFO] 
[INFO] --- maven-clean-plugin:2.4.1:clean (default-clean) @ wordcount-business ---
[INFO] Deleting /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-business/target
[INFO] 
[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ wordcount-business ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ wordcount-business ---
[INFO] Compiling 7 source files to /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-business/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.5:testResources (default-testResources) @ wordcount-business ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:2.3.2:testCompile (default-testCompile) @ wordcount-business ---
[INFO] Compiling 1 source file to /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-business/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ wordcount-business ---
[INFO] Surefire report directory: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-business/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running wordcount.IWordCountTest
11 févr. 2013 18:01:32 wordcount.util.PropertiesLoader getProperties
INFO: wordcount.xml is loaded :
11 févr. 2013 18:01:32 wordcount.util.PropertiesLoader getProperties
INFO: {textPathFile=/Users/tarik/Desktop/test.txt, textPathUrl=http://djebien.tarik.perso.sfr.fr/test.txt}
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.11 sec

Results :

Tests run: 6, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.3.2:jar (default-jar) @ wordcount-business ---
[INFO] Building jar: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-business/target/wordcount-business-1.0-SNAPSHOT.jar
[INFO] 
[INFO] >>> cobertura-maven-plugin:2.5.2:cobertura (default) @ wordcount-business >>>
[WARNING] The artifact org.apache.commons:commons-io:jar:1.3.2 has been relocated to commons-io:commons-io:jar:1.3.2
[INFO] 
[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ wordcount-business ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ wordcount-business ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- cobertura-maven-plugin:2.5.2:instrument (default) @ wordcount-business ---
[INFO] Cobertura 1.9.4.1 - GNU GPL License (NO WARRANTY) - See COPYRIGHT file
Instrumenting 8 files to /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-business/target/generated-classes/cobertura
Cobertura: Saved information on 8 classes.
Instrument time: 102ms

[INFO] Instrumentation was successful.
[INFO] NOT adding cobertura ser file to attached artifacts list.
[WARNING] The artifact org.apache.commons:commons-io:jar:1.3.2 has been relocated to commons-io:commons-io:jar:1.3.2
[INFO] 
[INFO] --- maven-resources-plugin:2.5:testResources (default-testResources) @ wordcount-business ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:2.3.2:testCompile (default-testCompile) @ wordcount-business ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ wordcount-business ---
[INFO] Surefire report directory: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-business/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running wordcount.IWordCountTest
11 févr. 2013 18:01:34 wordcount.util.PropertiesLoader getProperties
INFO: wordcount.xml is loaded :
11 févr. 2013 18:01:34 wordcount.util.PropertiesLoader getProperties
INFO: {textPathFile=/Users/tarik/Desktop/test.txt, textPathUrl=http://djebien.tarik.perso.sfr.fr/test.txt}
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.128 sec
Flushing results...
Flushing results done
Cobertura: Loaded information on 8 classes.
Cobertura: Saved information on 8 classes.

Results :

Tests run: 6, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] <<< cobertura-maven-plugin:2.5.2:cobertura (default) @ wordcount-business <<<
[INFO] 
[INFO] --- cobertura-maven-plugin:2.5.2:cobertura (default) @ wordcount-business ---
[INFO] Cobertura 1.9.4.1 - GNU GPL License (NO WARRANTY) - See COPYRIGHT file
Cobertura: Loaded information on 8 classes.
Report time: 290ms

[INFO] Cobertura Report generation was successful.
[INFO] 
[INFO] --- maven-install-plugin:2.3.1:install (default-install) @ wordcount-business ---
[INFO] Installing /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-business/target/wordcount-business-1.0-SNAPSHOT.jar to /Users/tarik/.m2/repository/wordcount/wordcount-business/1.0-SNAPSHOT/wordcount-business-1.0-SNAPSHOT.jar
[INFO] Installing /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-business/pom.xml to /Users/tarik/.m2/repository/wordcount/wordcount-business/1.0-SNAPSHOT/wordcount-business-1.0-SNAPSHOT.pom
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building wordcount-webapp Maven Webapp 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.4.1:clean (default-clean) @ wordcount-webapp ---
[INFO] Deleting /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target
[INFO] 
[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ wordcount-webapp ---
[debug] execute contextualize
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ wordcount-webapp ---
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 2 source files to /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.5:testResources (default-testResources) @ wordcount-webapp ---
[debug] execute contextualize
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:2.3.2:testCompile (default-testCompile) @ wordcount-webapp ---
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ wordcount-webapp ---
[INFO] Surefire report directory: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running wordcount.selenium.WordCountWebAppTest
11 févr. 2013 18:01:48 wordcount.util.PropertiesLoader getProperties
INFO: wordcount.xml is loaded :
11 févr. 2013 18:01:48 wordcount.util.PropertiesLoader getProperties
INFO: {textPathFile=/Users/tarik/Desktop/test.txt, textPathUrl=http://djebien.tarik.perso.sfr.fr/test.txt}
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 51.879 sec

Results :

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-war-plugin:2.1.1:war (default-war) @ wordcount-webapp ---
[INFO] Packaging webapp
[INFO] Assembling webapp [wordcount-webapp] in [/Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target/wordcount-webapp-1.0-SNAPSHOT]
[INFO] Processing war project
[INFO] Copying webapp resources [/Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/src/main/webapp]
[INFO] Webapp assembled in [1285 msecs]
[INFO] Building war: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target/wordcount-webapp-1.0-SNAPSHOT.war
[INFO] WEB-INF/web.xml already added, skipping
[INFO] 
[INFO] --- selenium-maven-plugin:1.0.1:start-server (start) @ wordcount-webapp ---
Created dir: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target/selenium
Launching Selenium Server
Waiting for Selenium Server...
[INFO] User extensions: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target/selenium/user-extensions.js
18:02:32,972 INFO  [org.openqa.selenium.server.SeleniumServer] Java: Apple Inc. 20.12-b01-434
18:02:32,972 INFO  [org.openqa.selenium.server.SeleniumServer] OS: Mac OS X 10.7.5 x86_64
18:02:32,978 INFO  [org.openqa.selenium.server.SeleniumServer] v2.0 [a2], with Core v2.0 [a2]
18:02:33,062 INFO  [org.openqa.selenium.server.SeleniumServer] RemoteWebDriver instances should connect to: http://10.19.3.26:4444/wd/hub
18:02:33,063 INFO  [org.openqa.jetty.http.HttpServer] Version Jetty/5.1.x
18:02:33,064 INFO  [org.openqa.jetty.util.Container] Started HttpContext[/selenium-server/driver,/selenium-server/driver]
18:02:33,064 INFO  [org.openqa.jetty.util.Container] Started HttpContext[/selenium-server,/selenium-server]
18:02:33,064 INFO  [org.openqa.jetty.util.Container] Started HttpContext[/,/]
18:02:33,114 INFO  [org.openqa.jetty.util.Container] Started org.openqa.jetty.jetty.servlet.ServletHandler@303bc257
18:02:33,114 INFO  [org.openqa.jetty.util.Container] Started HttpContext[/wd,/wd]
18:02:33,119 INFO  [org.openqa.jetty.http.SocketListener] Started SocketListener on 0.0.0.0:4444
18:02:33,119 INFO  [org.openqa.jetty.util.Container] Started org.openqa.jetty.jetty.Server@7c4c51
18:02:33,646 INFO  [org.openqa.jetty.util.Credential] Checking Resource aliases
Selenium Server started
[INFO] 
[INFO] --- maven-failsafe-plugin:2.7.2:integration-test (integration-test) @ wordcount-webapp ---
[INFO] Failsafe report directory: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running wordcount.selenium.WordCountWebAppTest
11 févr. 2013 18:02:44 wordcount.util.PropertiesLoader getProperties
INFO: wordcount.xml is loaded :
11 févr. 2013 18:02:44 wordcount.util.PropertiesLoader getProperties
INFO: {textPathFile=/Users/tarik/Desktop/test.txt, textPathUrl=http://djebien.tarik.perso.sfr.fr/test.txt}
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 51.426 sec

Results :

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] 
[INFO] --- selenium-maven-plugin:1.0.1:stop-server (stop) @ wordcount-webapp ---
Stopping Selenium server...
18:03:25,745 INFO  [org.openqa.jetty.util.Credential] Checking Resource aliases
18:03:25,748 INFO  [org.openqa.selenium.server.SeleniumDriverResourceHandler] Command request: shutDownSeleniumServer[, ] on session null
18:03:25,750 INFO  [org.openqa.selenium.server.SeleniumDriverResourceHandler] Shutdown command received
18:03:25,751 INFO  [org.openqa.selenium.server.SeleniumDriverResourceHandler] initiating shutdown
Stop request sent
18:03:25,751 INFO  [org.openqa.selenium.server.SeleniumDriverResourceHandler] Got result: OK on session null
[INFO] 
[INFO] --- maven-failsafe-plugin:2.7.2:verify (verify) @ wordcount-webapp ---
[INFO] Failsafe report directory: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target/surefire-reports
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] 
[INFO] --- maven-install-plugin:2.3.1:install (default-install) @ wordcount-webapp ---
[INFO] Installing /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/target/wordcount-webapp-1.0-SNAPSHOT.war to /Users/tarik/.m2/repository/wordcount/wordcount-webapp/1.0-SNAPSHOT/wordcount-webapp-1.0-SNAPSHOT.war
18:03:26,268 INFO  [org.openqa.selenium.server.SeleniumServer] Shutting down...
[INFO] Installing /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/wordcount-webapp/pom.xml to /Users/tarik/.m2/repository/wordcount/wordcount-webapp/1.0-SNAPSHOT/wordcount-webapp-1.0-SNAPSHOT.pom
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building palindrome-business 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.4.1:clean (default-clean) @ palindrome-business ---
[INFO] Deleting /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/palindrome-business/target
[INFO] 
[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ palindrome-business ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/palindrome-business/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ palindrome-business ---
[INFO] Compiling 2 source files to /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/palindrome-business/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.5:testResources (default-testResources) @ palindrome-business ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/palindrome-business/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:2.3.2:testCompile (default-testCompile) @ palindrome-business ---
[INFO] Compiling 1 source file to /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/palindrome-business/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ palindrome-business ---
[INFO] Surefire report directory: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/palindrome-business/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.palindrome.business.PalindromeServiceTest
11 févr. 2013 18:03:27 wordcount.util.FileLoader getTextFile
GRAVE: Le fichier a/bad/url/path n'existe pas.
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.123 sec

Results :

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.3.2:jar (default-jar) @ palindrome-business ---
[INFO] Building jar: /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/palindrome-business/target/palindrome-business-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.3.1:install (default-install) @ palindrome-business ---
[INFO] Installing /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/palindrome-business/target/palindrome-business-1.0-SNAPSHOT.jar to /Users/tarik/.m2/repository/wordcount/palindrome-business/1.0-SNAPSHOT/palindrome-business-1.0-SNAPSHOT.jar
[INFO] Installing /Users/tarik/Documents/Informatique/Projet/WorkspaceJEE/wordcount-parent/palindrome-business/pom.xml to /Users/tarik/.m2/repository/wordcount/palindrome-business/1.0-SNAPSHOT/palindrome-business-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] Maven ............................................. SUCCESS [0.900s]
[INFO] wordcount-business ................................ SUCCESS [5.305s]
[INFO] wordcount-webapp Maven Webapp ..................... SUCCESS [1:51.248s]
[INFO] palindrome-business ............................... SUCCESS [1.169s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1:58.782s
[INFO] Finished at: Mon Feb 11 18:03:27 CET 2013
[INFO] Final Memory: 20M/81M
[INFO] ------------------------------------------------------------------------

**********************************************************************************************************
************************************ Web App WordCount ***************************************************
**********************************************************************************************************

- Deployer le war généré dans wordcount-webapp/target/wordcount-webapp-1.0-SNAPSHOT.war sur un serveur JEE
pour utiliser la webApp via l'url : http://localhost:8080/wordcount-webapp/


**********************************************************************************************************
******************************* Generation du site du projet *********************************************
**********************************************************************************************************

1- lancer votre serveur tomcat ou jetty selon votre configuration.
2- faire un : mvn clean site
3- Stopper tomcat ou jetty s'il tourne sur le port 8080
3- puis faire un : mvn site:run

- Voir le site du projet sur http://localhost:8080/

avec toutes les rubriques attendues :

  +  Project Information
  
    - About
    - Project Team
    - Project Modules
    - Dependency Information
    - Project Plugins
    - Continuous Integration
    - Issue Tracking
    - Source Repository
    - Dependency Convergence
    - Project License
    - Plugin Management
    - Distribution Management
    - Project Summary
    - Mailing Lists
    - Dependencies
  
  +  Project Reports
      -  JavaDocs
      -  Test JavaDocs
      -  Surefire Report
      -  Source Xref
      -  Test Source Xref
      -  Checkstyle


Si besoin,

lors d'une execution maven sur console : faire kill -9 le PID du process jetty sur le port 8080 une fois la consultation terminée.
lors d'une execution maven plugin eclipse : faire clic sur le carré rouge en haut à droite de la console eclipse pour tuer 
                                        le processus jetty démarré avec mvn site:run

On evitera par la suite d'avoir un conflit entre le port d'ecoute de tomcat:8080 par exemple 
lors d'un mvn site, verify, install, etc... utilisant à nouveau le plugin jetty:8080.


**********************************************************************************************************
******************************* Deploiement sur Nexus local  *********************************************
**********************************************************************************************************

1- Telechargement, installation, demarrage et configuration du Nexus Sonatype.
2- Declaration du repository nexus local et des configuration pour aller chercher les SNAPSHOT et plugins
   sur le nexus dans wordcount-parent/pom.xml
   modifier les url du nexus pour le pointer vers votre machine
3- Declaration du nexus dans le Fichier .m2/settings.xml :

<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">
  <localRepository/>
  <interactiveMode/>
  <usePluginRegistry/>
  <offline/>
  <pluginGroups/>
  <servers>
    <server>
      <id>nexus</id>
      <username>admin</username>
      <password>admin123</password>
    </server>
  </servers>
  <mirrors/>
  <proxies>
    <proxy>
      <id>lille1Proxy</id>
      <active>false</active>
      <protocol>http</protocol>
      <host>cache-etu.univ-lille1.fr</host>
      <port>3128</port>
      <username>tarik.djebien</username>
      <password>********</password>
      <nonProxyHosts>*.google.com|ibiblio.org</nonProxyHosts>
    </proxy>
  </proxies>
  <profiles/>
  <activeProfiles/>
</settings>

4- Attention il y a une correspondance entre l'id du nexus dans le .m2/pom.xml et celui dans wordcount-parent/pom.xml

5- Commandes Maven pour deploiement sur Nexus :

mvn deploy deploiera les snapshots dans http://localhost:8081/nexus/content/repositories/snapshots/
mvn release deploiera les snapshots dans http://localhost:8081/nexus/content/repositories/releases/

Remarques : vérifier que l'id déclaré dans le settings.xml correspond bien à celui spécifié 
            au niveau du repository avec l'url du Nexus local.

Cordialement,

Tarik Djebien.

**********************************************************************************************************