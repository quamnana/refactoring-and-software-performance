// Before Refactoring
public static int writeUtf8(ByteBuf buf, CharSequence seq) {
    // Original implementation
    // ...
    for (int i = 0; i < seq.length(); i++) {
        char c = seq.charAt(i);
        // Encoding logic
        // ...
    }
    // ...
}

// After Refactoring
public static int writeUtf8(ByteBuf buf, CharSequence seq) {
    // Refactored implementation with extracted variable
    int length = seq.length();
    // ...
    for (int i = 0; i < length; i++) {
        char c = seq.charAt(i);
        // Encoding logic
        // ...
    }
    // ...
}
