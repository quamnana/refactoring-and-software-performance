// Before Refactoring
private void waitForMetadata() {
    final long metadataRefreshInterval = coreConfiguration.metadataRefreshInterval.getMillis();
    // ... existing code ...
}

// After Refactoring
private void waitForMetadata() {
    // Directly using the method call without assigning it to a variable
    // ... existing code ...
}
