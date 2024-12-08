package com.github.pavelhrdina.procesor;

public class ProcesorSpecification {
    /*
     * Procesor specification for the Chip-8 interpreter.
     *
     */
    public int opcode;
    public char[] memory = new char[4096];
    public char[] V = new char[16];
    public short I;
    public short pc;
    public char[] gfx = new char[64 * 32];
    public char delay_timer;
    public char sound_timer;
    public char[] stack = new char[16];
    public char sp;
    public char[] key = new char[16];
}
