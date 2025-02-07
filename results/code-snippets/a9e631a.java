// Before Refactoring
protected final void processAnnotationOnClass(MethodMetadata data, Class<?> targetType) {
    // Existing logic with inline expressions
    if (targetType.isAnnotationPresent(SomeAnnotation.class)) {
        data.addAnnotation(targetType.getAnnotation(SomeAnnotation.class));
    }
    // Additional processing...
}

// After Refactoring
protected final void processAnnotationOnClass(MethodMetadata data, Class<?> targetType) {
    // Extracted variable for clarity
    SomeAnnotation annotation = targetType.getAnnotation(SomeAnnotation.class);
    if (annotation != null) {
        data.addAnnotation(annotation);
    }
    // Additional processing...
}
