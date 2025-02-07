// Before Refactoring
static int epollWait(FileDescriptor epollFd, EpollEventArray events, boolean immediatePoll) {
    // Original implementation with separate method calls
    int timeout = calculateTimeout(immediatePoll);
    return epollWaitNative(epollFd, events, timeout);
}

private static int calculateTimeout(boolean immediatePoll) {
    return immediatePoll ? 0 : -1;
}

private static native int epollWaitNative(FileDescriptor epollFd, EpollEventArray events, int timeout);

// After Refactoring
static int epollWait(FileDescriptor epollFd, EpollEventArray events, boolean immediatePoll) {
    // Inlined method calls for performance optimization
    int timeout = immediatePoll ? 0 : -1;
    return epollWaitNative(epollFd, events, timeout);
}

private static native int epollWaitNative(FileDescriptor epollFd, EpollEventArray events, int timeout);
