# A CHIP-8 interpreter written in Java

![Screenshot](screenshot.png)

This is a project I started to learn more about emulation and the CHIP-8
system. The project is written in Java using the LWJGL library for graphics,
input and audio handling. The goal is to creat a simple and easy to use CHIP-8
interpreter that can run most CHIP-8 games, I just want it to work, and I don't 
care about code style, the only requirement is that the code is readable and 
easy to understand.

## Building and running the project

To build the project you need to have gradle installed. You can then run the 
following command to build the project:

```bash
./gradlew build
```

To run the project you can use the following command:

```bash
./gradlew check
./gradlew run
```

## License

The code is free and is licensed under the [MIT License](LICENSE).
