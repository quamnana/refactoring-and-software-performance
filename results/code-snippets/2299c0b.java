// Before Refactoring
public static boolean configure(Configurable config) {
    // Complex logic handling configuration
    // ...
    // Directly processing properties
    if (properties != null) {
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            config.property(entry.getKey(), entry.getValue());
        }
    }
    // ...
}

// After Refactoring
public static boolean configure(Configurable config) {
    // Delegating property processing to a new method
    Map<String, String> properties = loadExternalProperties();
    applyProperties(config, properties);
    // ...
}

private static void applyProperties(Configurable config, Map<String, String> properties) {
    if (properties != null) {
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            config.property(entry.getKey(), entry.getValue());
        }
    }
}
