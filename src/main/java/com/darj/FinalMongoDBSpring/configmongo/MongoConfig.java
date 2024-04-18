package com.darj.FinalMongoDBSpring.configmongo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfig {

    @Bean
    public MongoTemplate mongoTemplate() {
        // Configura la URL de conexión a MongoDB
        String connectionString = "mongodb+srv://diego6382:javadeveloper@clusterclass7.ss1ltkd.mongodb.net/DiegoDataBase?retryWrites=true&w=majority&appName=ClusterClass7";
        // Crea una fábrica de base de datos MongoDB usando la URL de conexión
        SimpleMongoClientDatabaseFactory databaseFactory = new SimpleMongoClientDatabaseFactory(connectionString);
        // Crea y devuelve el MongoTemplate utilizando la fábrica de base de datos
        return new MongoTemplate(databaseFactory);
    }
}