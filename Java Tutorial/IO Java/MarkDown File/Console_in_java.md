# Console Class in Java

## Overview

The `Console` class in Java provides methods to interact with the console, allowing you to read user input and display output. It is part of the `java.io` package and is useful for console-based applications where you need to read passwords or other sensitive information securely. It is available since Java 1.5 and is commonly used in command-line applications.

## Key Methods

### 1. `String readLine()`

```java
String readLine()
```

- **Description**:
  - Reads a single line of text from the console.

### 2. `String readLine(String fmt, Object... args)`

```java
String readLine(String fmt, Object... args)
```

- **Parameters**:

  - `fmt`: A format string, as described in `String.format`.
  - `args`: Arguments referenced by the format specifiers in the format string.

- **Description**:
  - Reads a formatted line of text from the console.

### 3. `char[] readPassword()`

```java
char[] readPassword()
```

- **Description**:
  - Reads a password from the console. The input is not displayed on the screen.

### 4. `char[] readPassword(String fmt, Object... args)`

```java
char[] readPassword(String fmt, Object... args)
```

- **Parameters**:

  - `fmt`: A format string.
  - `args`: Arguments referenced by the format specifiers.

- **Description**:
  - Reads a formatted password from the console. The input is not displayed on the screen.

### 5. `PrintWriter writer()`

```java
PrintWriter writer()
```

- **Description**:
  - Returns the `PrintWriter` object used to write output to the console.

## Example Usage

### Example 1: Reading and Writing with Console

This example demonstrates how to read input from the console and write output to it.

```java
import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available");
            return;
        }

        // Reading a line of input
        String input = console.readLine("Enter your name: ");
        System.out.println("Hello, " + input + "!");

        // Reading a password
        char[] password = console.readPassword("Enter your password: ");
        System.out.println("Password received.");
    }
}
```

**Expected Output**:

- The program will prompt for your name and password. The password will not be displayed as you type it.

### Example 2: Formatted Input and Output

This example shows how to use formatted input and output with the `Console` class.

```java
import java.io.Console;

public class FormattedConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available");
            return;
        }

        // Formatted input
        String name = console.readLine("Enter your name: ");
        int age = Integer.parseInt(console.readLine("Enter your age: "));
        console.printf("Name: %s, Age: %d%n", name, age);
    }
}
```

**Expected Output**:

- The program will prompt for your name and age, then display the formatted result.

## When to Use

- **Command-Line Applications**: Useful for applications that run in a console environment and need to interact with the user.
- **Password Input**: Provides a secure way to input passwords without displaying them on the screen.

## Limitations

- **Non-Interactive Environments**: `Console` may return `null` if the program is not run in an interactive console environment (e.g., in some IDEs or when redirected from files).
- **Not Available in Some IDEs**: Some IDEs do not support console input/output properly, so `System.console()` may return `null`.

## Differences from Other Classes

- **Scanner**: `Scanner` can also be used for console input, but `Console` provides additional functionality for password input and formatted reading.
- **PrintStream**: `PrintStream` is used for writing output to the console, but `Console` provides a higher-level abstraction that includes both reading and writing functionalities.
