# PullRequestManager

Mise en place du projet :
> PRM-Parent : POM Parent de build
> PRM-EAR : Archive de déploiement Wildfly 10.0.0
> PRM-Manager : projet EJB Entity hibernate
> PRM-Service : projet de bean session couche metier

Build : PRM-Parent : mvn:install
Archive déployable sous Wildfly 10.0.0 :
	> URL d'index : http://localhost:8080/PRM-Web/index.jsp

Création d'un plugin : 
Pré-requis : 
	*Maven installé sur votre poste
	*JDK 1.8
	
Télécharger la librairie : https://drive.google.com/open?id=0B0u9sxblZpSsS01MVFdidnBMUDQ (PRM-API)
Placer vous dans le répertoire du fichier téléchargé (PRM-API-1.0.0) avec un invite au commande et lancer : 
mvn install:install-file -DgroupId=com.escowad.prm -DartifactId=PRM-API -Dversion=1.0.0 -Dpackaging=jar -Dfile=PRM-API-1.0.0.jar
Créér votre projet maven sous l'IDE de votre choix, puis ajoutez les dependances suivantes : 

		<dependency>
			<groupId>com.escowad.prm</groupId>
			<artifactId>PRM-API</artifactId>
			<version>1.0.0</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.eclipse.mylyn.github</groupId>
			<artifactId>org.eclipse.egit.github.core</artifactId>
			<version>2.1.5</version>
			<scope>provided</scope>
		</dependency>

Implémenter la classe com.escowad.prm.api.entity.IPRM (Javadoc disponible dans l'API).
Compiler votre plugin avec Java 1.8, sous maven :
	<build>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
					<encoding>UTF-8</encoding>
				</configuration>
			</plugin>
		</plugins>
	</build>
/!\ Dans le cas de dépendances externes dans votre plugin, vous devez les ajouter à votre processus de build (avec maven) : 
 	<build>
		<plugins>
			<plugin>
				<artifactId>maven-assembly-plugin</artifactId>
				<configuration>
					<archive>
					</archive>
					<descriptorRefs>
						<descriptorRef>jar-with-dependencies</descriptorRef>
					</descriptorRefs>
				</configuration>
				<executions>
					<execution>
						<id>make-assembly</id> this is used for inheritance merges
						<phase>package</phase> bind to the packaging phase
						<goals>
							<goal>single</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
Puis uploader votre plugin via l'interface PRM-Manager
