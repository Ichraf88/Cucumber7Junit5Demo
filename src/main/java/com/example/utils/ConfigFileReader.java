package com.example.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class ConfigFileReader {

    // Le fichier doit être dans le classpath:
    // src/test/resources/junit-platform.properties
    private static final String PROPERTY_FILE_NAME = "junit-platform.properties";
    private final Properties properties = new Properties();

    public ConfigFileReader() {
        loadProperties();
    }

    private void loadProperties() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        try (InputStream inputStream = classLoader.getResourceAsStream(PROPERTY_FILE_NAME)) {
            if (inputStream == null) {
                throw new RuntimeException(
                        "Configuration file not found in classpath: " + PROPERTY_FILE_NAME
                                + " (Expected location: src/test/resources/" + PROPERTY_FILE_NAME + ")"
                );
            }
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file: " + PROPERTY_FILE_NAME, e);
        }
    }

    public String getProperty(String key) {
        String value = properties.getProperty(key);

        if (Objects.isNull(value) || value.isBlank()) {
            throw new RuntimeException("Property '" + key + "' is missing or blank in " + PROPERTY_FILE_NAME);
        }

        return value;
    }
}