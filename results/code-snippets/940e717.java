// Before Refactoring
public void fillStackTrace(List<Stacktrace> stacktrace) {
    // Original implementation with inlined logic
    // ...
    for (int i = 0; i < stackTraceElements.length; i++) {
        // Complex logic directly within the loop
        // ...
    }
    // ...
}

// After Refactoring
public void fillStackTrace(List<Stacktrace> stacktrace) {
    // Refactored implementation with extracted method
    // ...
    for (int i = 0; i < stackTraceElements.length; i++) {
        processStackTraceElement(stackTraceElements[i], stacktrace);
    }
    // ...
}

private void processStackTraceElement(StackTraceElement element, List<Stacktrace> stacktrace) {
    // Logic extracted from the original loop
    // ...
}
