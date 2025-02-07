// Before Refactoring
public Entry<T> reserve() {
    // Original implementation with inlined logic
    if (head == null) {
        // Handle empty pool
        return null;
    }
    Entry<T> entry = head;
    head = entry.next;
    entry.next = null;
    return entry;
}

// After Refactoring
public Entry<T> reserve() {
    // Extracted variables for clarity
    final Entry<T> firstEntry = head;
    if (firstEntry == null) {
        // Handle empty pool
        return null;
    }
    final Entry<T> nextEntry = firstEntry.next;
    head = nextEntry;
    firstEntry.next = null;
    return firstEntry;
}
