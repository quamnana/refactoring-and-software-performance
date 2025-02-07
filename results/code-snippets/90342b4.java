// Before Refactoring
public static long lowerHexToUnsignedLong(String lowerHex) {
    if (lowerHex == null) throw new NullPointerException("lowerHex == null");
    int length = lowerHex.length();
    if (length < 1 || length > 16) {
        throw new NumberFormatException(
            lowerHex + " should be a 1 to 16 character lower-hex string with no prefix");
    }
    long result = 0;
    for (int i = 0; i < length; i++) {
        char c = lowerHex.charAt(i);
        result <<= 4;
        if (c >= '0' && c <= '9') {
            result |= c - '0';
        } else if (c >= 'a' && c <= 'f') {
            result |= c - 'a' + 10;
        } else {
            throw new NumberFormatException(c + " should be a lower-hex character");
        }
    }
    return result;
}

// After Refactoring
public static long lowerHexToUnsignedLong(String lowerHex) {
    if (lowerHex == null) throw new NullPointerException("lowerHex == null");
    int length = lowerHex.length();
    if (length < 1) {
        throw new NumberFormatException(
            lowerHex + " should be a 1 to 32 character lower-hex string with no prefix");
    }
    // trim the string to the right-most 16 characters
    int beginIndex = Math.max(0, length - 16);
    return lowerHexToUnsignedLong(lowerHex, beginIndex);
}

static long lowerHexToUnsignedLong(String lowerHex, int beginIndex) {
    int endIndex = Math.min(lowerHex.length(), beginIndex + 16);
    long result = 0;
    for (int i = beginIndex; i < endIndex; i++) {
        char c = lowerHex.charAt(i);
        result <<= 4;
        if (c >= '0' && c <= '9') {
            result |= c - '0';
        } else if (c >= 'a' && c <= 'f') {
            result |= c - 'a' + 10;
        } else {
            throw new NumberFormatException(c + " should be a lower-hex character");
        }
    }
    return result;
}
