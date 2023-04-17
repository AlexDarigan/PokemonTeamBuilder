FROM openjdk:8-jdk-alpine
MAINTAINER AlexDarigan
COPY target/PokemonTeamBuilder-1.0-SNAPSHOT.jar PokemonTeamBuilder-1.0-SNAPSHOT.jar
ENV TeamBuilderDBUsername=myuser
ENV TeamBuilderDBPassword=mypassword
ENTRYPOINT ["java", "-jar", "/PokemonTeamBuilder-1.0-SNAPSHOT.jar"]