/**
 * the alplication entry point
 * @file Main.java
 * @brief The main class of the application
 * @version 0.1
 * @author Pavel Hrdina
 */

package com.github.pavelhrdina;


// application entry point
public class Main {
    /**
     * The main method is the entry point of the application.
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Chip8Font.fontDefinition(0));
    }
}