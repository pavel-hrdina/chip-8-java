package com.github.pavelhrdina;

public class ProcessorSpecification {
    /**
     * The Chip-8 has 35 opcodes which are all two bytes long and stored big-endian.
     */
    public int opcode;
    /**
     * The Chip-8 has 4K memory in total.
     */
    public char[] memory = new char[4096];
    /**
     * The Chip-8 has 16 general purpose 8-bit registers, usually referred to as Vx.
     */
    public char[] V = new char[16];
    /**
     * Index register I.
     */
    public short I;
    /**
     * Program counter.
     */
    public short pc;
    /**
     * The Chip-8 has a HEX based keypad (0x0-0xF).
     */
    public char[] gfx = new char[64 * 32];
    /**
     * The Chip-8 has two timer registers that count at 60 Hz.
     * When set above zero they will count down to zero.
     */
    public char delay_timer;
    /**
     * The Chip-8 has two timer registers that count at 60 Hz.
     * When set above zero they will count down to zero.
     */
    public char sound_timer;
    /**
     * The Chip-8 has a stack for 16 levels.
     */
    public char[] stack = new char[16];
    /**
     * The Chip-8 has a stack pointer.
     */
    public char sp;
    /**
     * The Chip-8 has a HEX based keypad (0x0-0xF).
     */
    public char[] key = new char[16];
}
