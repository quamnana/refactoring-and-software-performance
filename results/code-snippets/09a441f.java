// Before Refactoring
public static boolean readList(byte[] bytes, Collection<Span> out) {
    Buffer buffer = new Buffer(bytes);
    // ... existing parsing logic ...
}

// After Refactoring
public static boolean readList(byte[] bytes, Collection<Span> out) {
    UnsafeBuffer buffer = new UnsafeBuffer(bytes);
    // ... updated parsing logic ...
}
