// Before Refactoring
public PropertyMatchingScore matches(String property) {
    // Original implementation with inlined logic
    // ...
}

// After Refactoring
public PropertyMatchingScore matches(String property) {
    // Extracted method and variables
    String processedProperty = processProperty(property);
    return calculateMatchingScore(processedProperty);
}

private String processProperty(String property) {
    // Logic extracted from matches method
    // ...
}

private PropertyMatchingScore calculateMatchingScore(String property) {
    // Logic extracted from matches method
    // ...
}
