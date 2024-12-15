package com.github.pavelhrdina.utils;

import com.github.pavelhrdina.core.Chip8Context;

/**
 * Call will convert a single digit number to its kilobyte equivalent
 */
public class Kilobytes {
    protected Kilobytes() {
    }

    /**
     * Converts the given size in bytes to kilobytes.
     *
     * @param bytes the size in bytes to be converted
     * @return the size in kilobytes
     */
    public static long[] toKilobytes(long bytes) {
        return new long[]{bytes * 1024L};
    }
}
