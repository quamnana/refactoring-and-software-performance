// Before Refactoring
public Transaction startTransaction() {
    // Original implementation with inlined logic
    if (isNoop()) {
        return noopTransaction();
    }
    Transaction transaction = new Transaction(/* parameters */);
    // Additional setup and initialization
    return transaction;
}

// After Refactoring
public Transaction startTransaction() {
    if (isNoop()) {
        return noopTransaction();
    }
    return createAndInitializeTransaction();
}

private Transaction createAndInitializeTransaction() {
    Transaction transaction = new Transaction(/* parameters */);
    // Additional setup and initialization
    return transaction;
}
