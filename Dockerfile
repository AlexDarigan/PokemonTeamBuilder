FROM maven:3.8.3-openjdk-8-slim
MAINTAINER AlexDarigan
EXPOSE 8081
COPY . .
ENV TeamBuilderDBUsername=myuser
ENV TeamBuilderDBPassword=mypassword
RUN mvn clean install
CMD ["java", "-jar", "target/PokemonTeamBuilder-1.0-SNAPSHOT.jar"]
