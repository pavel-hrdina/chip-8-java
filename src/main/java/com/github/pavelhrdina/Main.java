package com.github.pavelhrdina;

import com.github.pavelhrdina.util.Chip8Font;

// application entry point
public class Main{
    /**
     * The main method is the entry point of the application.
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // main cpu loop
        /**
         * The main cpu loop.
         */
        // for mow just print the font definition at index 0
        System.out.println(Chip8Font.fontDefinition(0));
    }
}