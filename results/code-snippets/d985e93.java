// Before Refactoring
public HttpCall<Void> build() {
    Map<String, String> headers = new LinkedHashMap<>();
    // ... existing logic ...
}

// After Refactoring
public HttpCall<Void> build() {
    final Map<String, String> headers = new LinkedHashMap<>();
    // ... updated logic ...
}
