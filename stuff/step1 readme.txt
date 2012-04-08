tinylibrary

1.
mvn archetype:create -DgroupId=com.mycompany.projectname -DartifactId=projectname -DarchetypeArtifactId=maven-archetype-webapp

mvn archetype:create -DgroupId=creative.fire.jsfrf.tinylibrary -DartifactId=tinylibrary -DarchetypeArtifactId=maven-archetype-webapp

2.
Add the JSF dependencies to your Maven POM file, /pom.xml, according to which JSF implementation you choose. The Mojarra implementation is shown here:

<properties>
	<jsf.version>2.1</jsf.version>
	<sun.faces.version>2.1.2</sun.faces.version>
</properties>
<repositories>
    <repository>
        <id>maven2-repository.dev.java.net</id>
        <name>Java.net Repository for Maven</name>
        <url>http://download.java.net/maven/2</url>
    </repository>
</repositories>

<dependencies>
    <!-- Option 1: Use if deploying to a Java EE application server (GlassFish, JBoss AS, etc) -->
    <dependency>
        <groupId>javax.faces</groupId>
        <artifactId>jsf-api</artifactId>
        <version>${jsf.version}</version>
        <scope>provided</scope>
    </dependency>

    <!-- Option 2: Use if deploying to a servlet container (Tomcat, Jetty, etc) -->
<!--
    <dependency>
        <groupId>com.sun.faces</groupId>
        <artifactId>jsf-api</artifactId>
        <version>${sun.faces.version}</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>com.sun.faces</groupId>
        <artifactId>jsf-impl</artifactId>
        <version>${sun.faces.version}</version>
        <scope>runtime</scope>
    </dependency> 
-->
</dependencies>

<build>
	<finalName>tinylibrary</finalName>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>2.0.2</version>
            <configuration>
                 <source>1.5</source>
                 <target>1.5</target>
                 <encoding>UTF-8</encoding>
            </configuration>
        </plugin>
    </plugins>
</build>

3.
mvn eclipse:eclipse -Dwtpversion=2.0
For NetBeans/IntelliJ Users: You should be able to import the project root folder directly, as a Maven project.

4.
/src/main/webapp/WEB-INF/web.xml:

<web-app>
    <display-name>Archetype Created Web Application</display-name>

    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>

    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>Faces Servlet</servlet-name>
        <url-pattern>*.jsf</url-pattern>
    </servlet-mapping>
</web-app>