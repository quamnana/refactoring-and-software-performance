// Before Refactoring
public static Optional<Type> findGenericParameter(Type type, Class<?> parameterizedSupertype, int n) {
    // Original implementation using Guava's TypeToken
    TypeToken<?> token = TypeToken.of(type);
    TypeToken<?> supertype = token.getSupertype(parameterizedSupertype);
    Type resolvedType = supertype.getType();
    // Further processing to extract the nth generic parameter
    // ...
    return Optional.ofNullable(resolvedParameter);
}

//After Refactoring
public static Optional<Type> findGenericParameter(Type type, Class<?> parameterizedSupertype, int n) {
    // Refactored implementation using GeAnTyRef
    Type resolvedType = GenericTypeReflector.getExactSuperType(type, parameterizedSupertype);
    // Further processing to extract the nth generic parameter
    // ...
    return Optional.ofNullable(resolvedParameter);
}
