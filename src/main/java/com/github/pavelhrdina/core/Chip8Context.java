package com.github.pavelhrdina.core;

import com.github.pavelhrdina.utils.Kilobytes;

/**
 * Represents the context for the Chip8 emulator, containing the necessary
 * state and resources to execute Chip8 programs.
 */
public class Chip8Context {
    /**
     * Private constructor to prevent direct instantiation of the Chip8Context class.
     * This ensures that Chip8Context is utilized as intended, likely through controlled
     * instantiation mechanisms within the class or related components.
     */
    private Chip8Context() {
    }

    /**
     * The memory size is statically configured to 4 kilobytes, which is a typical
     * size for the traditional Chip-8 architecture.
     */
    public static final long[] memory = Kilobytes.toKilobytes(4L);


    /**
     * Represents the general-purpose registers in the Chip-8 system.
     * Chip-8 has 16 8-bit registers, labeled V0 through VF.
     * These registers are used for various computations and program execution.
     *
     * Note: The "VF" register (V[15]) is often utilized as a flag for specific operations.
     */
    public static final byte[] V = new byte[16];

    /**
     * A fixed-size stack used by the Chip-8 interpreter to manage return addresses
     * for subroutine calls and other operations requiring temporary storage.
     */
    public static final byte[] stack = new byte[16];


    /**
     * Represents the I register in the Chip-8 system. The I register is typically
     * used to store memory addresses and plays a crucial role in various
     * instructions within the Chip-8 virtual machine. This array is designed to
     * allocate 16 bytes of memory for the register, adhering to the requirements
     * of the Chip-8 system architecture.
     */
    public static final byte[] I = new byte[16];

    /**
     * Represents the program counter (PC) in the Chip-8 emulator.
     * The program counter is a crucial register that holds the memory address
     * of the currently executing instruction. It is generally incremented
     * or updated after each instruction execution, guiding the flow of program execution.
     * This array provides a 16-byte representation of the PC, which may include
     * auxiliary storage or extended functionality.
     */
    public static final byte[] PC = new byte[16];


    /**
     * Represents the stack pointer in the Chip-8 emulator.
     * The stack pointer is an 8-bit register used to point to the top of the stack,
     * allowing the Chip-8 system to manage subroutine calls and returns efficiently.
     * It is responsible for keeping track of the current level of the stack during execution.
     */
    public static final byte[] SP = new byte[8];

    /**
     * Represents the delay timer register in the Chip-8 emulator.
     * The delay register is an 8-bit register used to manage the delay timer, which decrements at
     * a consistent rate (60Hz) until it reaches zero. This timer is used for implementing delays
     * in Chip-8 programs and does not produce sound.
     */
    public static final byte[] delayRegister = new byte[8];

    /**
     * Represents the sound timer register in the Chip-8 emulator.
     * The sound register is an 8-bit register used to manage the sound timer, which decrements at a
     * consistent rate (60Hz) until it reaches zero. When the sound timer is non-zero, a sound is typically played.
     */
    public static final byte[] soundRegister = new byte[8];

    /**
     * Represents the frame buffer for the Chip-8 emulator's display.
     * The frame buffer is a monochrome 64x32 grid, where each byte represents a single pixel's state
     * (on or off). This buffer is used to store and render the current visual output of the emulator.
     */
    public static final byte[][] frameBuffer = new byte[64][32];

    /**
     * Retrieves the size of memory allocated for the Chip-8 in kilobytes.
     *
     * @return the size of memory in kilobytes
     */
    public static long[] getMemoryInKilobytes() {
        return memory;
    }
}
