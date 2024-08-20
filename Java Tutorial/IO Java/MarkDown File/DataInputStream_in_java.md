# DataInputStream Class in Java

## Overview

The `DataInputStream` class in Java allows you to read primitive Java data types (e.g., `int`, `float`, `double`, `char`, etc.) from an input stream in a machine-independent way. It provides methods to read binary data in a format that can be interpreted correctly regardless of the platform's byte order.

## Constructors

### 1. `DataInputStream(InputStream in)`

```java
DataInputStream(InputStream in)
```

- **Parameters**:

  - `in`: The underlying input stream to be used.

- **Description**:
  - Creates a `DataInputStream` that reads data from the specified input stream.

## Methods

### 1. `boolean readBoolean()`

```java
boolean readBoolean() throws IOException
```

- **Description**:
  - Reads a boolean value (1 byte) from the input stream.

### 2. `byte readByte()`

```java
byte readByte() throws IOException
```

- **Description**:
  - Reads a byte value (1 byte) from the input stream.

### 3. `char readChar()`

```java
char readChar() throws IOException
```

- **Description**:
  - Reads a character value (2 bytes) from the input stream.

### 4. `double readDouble()`

```java
double readDouble() throws IOException
```

- **Description**:
  - Reads a double value (8 bytes) from the input stream.

### 5. `float readFloat()`

```java
float readFloat() throws IOException
```

- **Description**:
  - Reads a float value (4 bytes) from the input stream.

### 6. `int readInt()`

```java
int readInt() throws IOException
```

- **Description**:
  - Reads an integer value (4 bytes) from the input stream.

### 7. `long readLong()`

```java
long readLong() throws IOException
```

- **Description**:
  - Reads a long value (8 bytes) from the input stream.

### 8. `short readShort()`

```java
short readShort() throws IOException
```

- **Description**:
  - Reads a short value (2 bytes) from the input stream.

### 9. `String readUTF()`

```java
String readUTF() throws IOException
```

- **Description**:
  - Reads a string in UTF-8 encoding from the input stream.

### 10. `void close()`

```java
void close() throws IOException
```

- **Description**:
  - Closes the input stream and releases any system resources associated with it.

## Example Usage

### Example 1: Reading Primitive Data Types

To complement the previous `DataOutputStream` example, let's assume we have a file `data.bin` created by the `DataOutputStream` example. The following code reads the data from that file.

```java
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            System.out.println("Boolean: " + dis.readBoolean());  // Output: true
            System.out.println("Byte: " + dis.readByte());         // Output: 123
            System.out.println("Char: " + dis.readChar());         // Output: A
            System.out.println("Double: " + dis.readDouble());     // Output: 123.456
            System.out.println("Float: " + dis.readFloat());       // Output: 78.9
            System.out.println("Int: " + dis.readInt());           // Output: 1000
            System.out.println("Long: " + dis.readLong());         // Output: 123456789
            System.out.println("Short: " + dis.readShort());       // Output: 50
            System.out.println("UTF String: " + dis.readUTF());    // Output: Hello, World!
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Expected Output**:

```sh
Boolean: true
Byte: 123
Char: A
Double: 123.456
Float: 78.9
Int: 1000
Long: 123456789
Short: 50
UTF String: Hello, World!
```

### Example 2: Handling Data with Different Byte Order

```java
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamByteOrderExample {
    public static void main(String[] args) {
        byte[] data = new byte[12];
        data[0] = 1;  // boolean (1 byte)
        data[1] = (byte) 123; // byte (1 byte)
        data[2] = 'A'; // char (2 bytes)
        data[4] = (byte) 0x40; // double (8 bytes, first byte of double)
        data[5] = (byte) 0x59; // double (second byte of double)
        data[6] = (byte) 0xF6; // double (third byte of double)
        data[7] = (byte) 0xF3; // double (fourth byte of double)
        data[8] = (byte) 0xD7; // double (fifth byte of double)
        data[9] = (byte) 0xBE; // double (sixth byte of double)
        data[10] = (byte) 0x2F; // double (seventh byte of double)
        data[11] = (byte) 0x40; // double (eighth byte of double)

        try (DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data))) {
            System.out.println("Boolean: " + dis.readBoolean());  // Output: true
            System.out.println("Byte: " + dis.readByte());         // Output: 123
            System.out.println("Char: " + dis.readChar());         // Output: A
            System.out.println("Double: " + dis.readDouble());     // Output: 1.0 (approx)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Expected Output**:

```sh
Boolean: true
Byte: 123
Char: A
Double: 1.0
```

## When to Use

- **Binary Data Reading**: Use `DataInputStream` to read binary data from files or network connections in a machine-independent format.
- **Compatibility**: Useful when reading data written by `DataOutputStream` or other systems that write binary data.

## Differences from Other Streams

- **ObjectInputStream**: `ObjectInputStream` reads serialized objects, whereas `DataInputStream` reads primitive data types.
- **BufferedInputStream**: `BufferedInputStream` provides buffering capabilities to an input stream, but `DataInputStream` is specifically designed for reading primitive data types in a machine-independent format.
