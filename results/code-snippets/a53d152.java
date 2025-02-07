// Before Refactoring
public static Optional<Type> findGenericParameter(Type type, Class<?> parameterizedSupertype, int n) {
    // Method implementation
}

// After Refactoring
@Nullable
public static Optional<Type> findGenericParameter(Type type, Class<?> parameterizedSupertype, int n) {
    // Method implementation
}
