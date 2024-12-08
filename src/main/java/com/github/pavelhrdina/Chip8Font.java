package com.github.pavelhrdina;

/**
 * represents the font in hexadecimal values for the Chip-8 interpreter.
 */
public class Chip8Font {
    /**
     * Font definition for the Chip-8 interpreter.
     *
     * @param address The address of the array item to be returned.
     */
    public static int fontDefinition(int address) {
        // Hexadecimal values are written in monospaced font. Assume all
        // monospaced numbers are hexadecimal unless otherwise stated.
        int[] font = new int[]{
                0xF0,
                0x90,
                0x90,
                0x90,
                0xF0,
                0x20,
                0x60,
                0x20,
                0x20,
                0x70,
                0xF0,
                0x10,
                0xF0,
                0x80,
                0xF0,
                0xF0,
                0x10,
                0xF0,
                0x10,
                0xF0,
                0x90,
                0x90,
                0xF0,
                0x10,
                0x10,
                0xF0,
                0x80,
                0xF0,
                0x10,
                0xF0,
                0xF0,
                0x80,
                0xF0,
                0x90,
                0xF0,
                0xF0,
                0x10,
                0x20,
                0x40,
                0x40,
                0xF0,
                0x90,
                0xF0,
                0x90,
                0xF0,
                0xF0,
                0x90,
                0xF0,
                0x10,
                0xF0,
                0xF0,
                0x90,
                0xF0,
                0x90,
                0x90,
                0xE0,
                0x90,
                0xE0,
                0x90,
                0xE0,
                0xF0,
                0x80,
                0x80,
                0x80,
                0xF0,
                0xE0,
                0x90,
                0x90,
                0x90,
                0xE0,
                0xF0,
                0x80,
                0xF0,
                0x80,
                0xF0,
                0xF0,
                0x80,
                0xF0,
                0x80,
                0x80,
        };
        return font[address];
    }
}
