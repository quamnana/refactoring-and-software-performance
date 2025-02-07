// Before Refactoring
@Override
public Optional<Argument> build(Type type, Object value, ConfigRegistry config) {
    // Original implementation logic
}

// After Refactoring
public Optional<Argument> build(Type type, Object value, ConfigRegistry config) {
    return innerBuild(value, config)
        .orElseThrow(() -> new UnableToCreateStatementException("Prepared argument " + value + " of type " + type + " failed to bind"));
}

private Optional<Argument> innerBuild(Object value, ConfigRegistry config) {
    // Extracted core logic from the original build method
}
