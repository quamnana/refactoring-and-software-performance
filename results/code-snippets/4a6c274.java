// Before Refactoring
protected Queue<HttpExchange> newExchangeQueue(HttpClient client) {
    return new BlockingArrayQueue<>(client.getMaxRequestsQueuedPerDestination());
}

// After Refactoring
protected Queue<HttpExchange> newExchangeQueue(HttpClient client) {
    int maxCapacity = client.getMaxRequestsQueuedPerDestination();
    int initialCapacity = Math.min(32, maxCapacity);
    return new BlockingArrayQueue<>(initialCapacity, initialCapacity, maxCapacity);
}
