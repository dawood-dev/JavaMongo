package javamongo.configs;

import io.micronaut.context.annotation.ConfigurationProperties;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties("mongodb")
public class MongoConfigProperties {
    @NotBlank
    public String database;
    @NotBlank
    public String customersCollection;
    @NotBlank
    public String filmsCollection;
    @NotBlank
    public String rentalsCollection;

}
