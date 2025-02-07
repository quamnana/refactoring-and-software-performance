// Before Refactoring
@Nullable
public Transaction currentTransaction() {
    final TraceContextHolder<?> bottomOfStack = activeStack.get().peekLast();
    if (bottomOfStack instanceof Transaction) {
        return (Transaction) bottomOfStack;
    } else {
        for (Iterator<TraceContextHolder<?>> it = activeStack.get().descendingIterator(); it.hasNext(); ) {
            TraceContextHolder<?> context = it.next();
            if (context instanceof Transaction) {
                return (Transaction) context;
            }
        }
    }
    return null;
}

// After Refactoring
@Nullable
public Transaction currentTransaction() {
    Deque<TraceContextHolder<?>> stack = activeStack.get();
    final TraceContextHolder<?> bottomOfStack = stack.peekLast();
    if (bottomOfStack instanceof Transaction) {
        return (Transaction) bottomOfStack;
    } else if (bottomOfStack != null) {
        for (Iterator<TraceContextHolder<?>> it = stack.descendingIterator(); it.hasNext(); ) {
            TraceContextHolder<?> context = it.next();
            if (context instanceof Transaction) {
                return (Transaction) context;
            }
        }
    }
    return null;
}
