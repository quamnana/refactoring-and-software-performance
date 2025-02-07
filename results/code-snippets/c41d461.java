// Before Refactoring
private long allocateRun(int runSize) {
    Long handle = runsAvail.pollFirst();
    // ... existing allocation logic ...
}

// After Refactoring
private long allocateRun(int runSize) {
    long handle = runsAvailHeap.poll();
    // ... updated allocation logic ...
}
