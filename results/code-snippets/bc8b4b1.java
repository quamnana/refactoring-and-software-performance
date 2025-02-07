// Before Refactoring
public Object proceed() throws Throwable {
    // Original logic handling the invocation
    // ...
    // Directly processing the response
    if (response.status() >= 200 && response.status() < 300) {
        // Success logic
    } else {
        // Error handling logic
    }
    // ...
}

//After Refactoring
public Object proceed() throws Throwable {
    // Original logic handling the invocation
    // ...
    // Delegating response processing to a new method
    return handleResponse(response);
}

private Object handleResponse(Response response) throws Throwable {
    if (response.status() >= 200 && response.status() < 300) {
        // Success logic
    } else {
        // Error handling logic
    }
}
