// Before Refactoring
public RequestTemplate target(String target) {
    // Existing logic
    if (target.endsWith("/")) {
        target = target.substring(0, target.length() - 1);
    }
    // Additional processing...
}

//After Refactoring
public RequestTemplate target(String target) {
    // Updated logic
    if (target.endsWith("/")) {
        target = target.substring(0, target.length() - 1);
    }
    if (!target.startsWith("/")) {
        target = "/" + target;
    }
    // Additional processing...
}
