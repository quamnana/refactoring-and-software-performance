// Before Refactoring
public Transaction currentTransaction() {
    Transaction transaction = getActiveTransaction();
    return transaction != null ? transaction : NoopTransaction.INSTANCE;
}

// After Refactoring
public Transaction currentTransaction() {
    return getActiveTransaction() != null ? getActiveTransaction() : NoopTransaction.INSTANCE;
}
