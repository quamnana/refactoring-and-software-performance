// Before Refactoring
public double get(double q) {
    // Original implementation with inlined logic
    List<Item> samples = ...; // Assume this is a List
    // Logic to compute quantile 'q' using 'samples'
    // ...
}

// After Refactoring
public double get(double q) {
    // Refactored implementation with extracted method and changed variable type
    Collection<Item> samples = getSamples();
    return computeQuantile(q, samples);
}

private Collection<Item> getSamples() {
    // Logic to retrieve samples, now returning a Collection instead of a List
    // ...
}

private double computeQuantile(double q, Collection<Item> samples) {
    // Logic to compute quantile 'q' using 'samples'
    // ...
}
