# DataOutputStream Class in Java

## Overview

The `DataOutputStream` class in Java allows you to write primitive Java data types (e.g., `int`, `float`, `double`, `char`, etc.) to an output stream in a machine-independent way. It provides methods to write data in a binary format, making it suitable for creating binary files or communicating with other systems using binary protocols.

## Constructors

### 1. `DataOutputStream(OutputStream out)`

```java
DataOutputStream(OutputStream out)
```

- **Parameters**:

  - `out`: The underlying output stream to be used.

- **Description**:
  - Creates a `DataOutputStream` that writes data to the specified output stream.

## Methods

### 1. `void writeBoolean(boolean v)`

```java
void writeBoolean(boolean v) throws IOException
```

- **Parameters**:

  - `v`: The boolean value to write.

- **Description**:
  - Writes a boolean value as a 1-byte value.

### 2. `void writeByte(int v)`

```java
void writeByte(int v) throws IOException
```

- **Parameters**:

  - `v`: The byte value to write.

- **Description**:
  - Writes a byte value.

### 3. `void writeChar(int v)`

```java
void writeChar(int v) throws IOException
```

- **Parameters**:

  - `v`: The character value to write.

- **Description**:
  - Writes a character value as a 2-byte value.

### 4. `void writeDouble(double v)`

```java
void writeDouble(double v) throws IOException
```

- **Parameters**:

  - `v`: The double value to write.

- **Description**:
  - Writes a double value as an 8-byte value.

### 5. `void writeFloat(float v)`

```java
void writeFloat(float v) throws IOException
```

- **Parameters**:

  - `v`: The float value to write.

- **Description**:
  - Writes a float value as a 4-byte value.

### 6. `void writeInt(int v)`

```java
void writeInt(int v) throws IOException
```

- **Parameters**:

  - `v`: The integer value to write.

- **Description**:
  - Writes an integer value as a 4-byte value.

### 7. `void writeLong(long v)`

```java
void writeLong(long v) throws IOException
```

- **Parameters**:

  - `v`: The long value to write.

- **Description**:
  - Writes a long value as an 8-byte value.

### 8. `void writeShort(int v)`

```java
void writeShort(int v) throws IOException
```

- **Parameters**:

  - `v`: The short value to write.

- **Description**:
  - Writes a short value as a 2-byte value.

### 9. `void writeUTF(String str)`

```java
void writeUTF(String str) throws IOException
```

- **Parameters**:

  - `str`: The string to write.

- **Description**:
  - Writes a string in UTF-8 encoding.

### 10. `void flush()`

```java
void flush() throws IOException
```

- **Description**:
  - Flushes the output stream and forces any buffered output bytes to be written out.

### 11. `void close()`

```java
void close() throws IOException
```

- **Description**:
  - Closes the output stream and releases any system resources associated with it.

## Example Usage

### Example 1: Writing Primitive Data Types

```java
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dos.writeBoolean(true);
            dos.writeByte(123);
            dos.writeChar('A');
            dos.writeDouble(123.456);
            dos.writeFloat(78.9f);
            dos.writeInt(1000);
            dos.writeLong(123456789L);
            dos.writeShort(50);
            dos.writeUTF("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Expected Output**:

- This code does not produce visible output directly. It creates a binary file named `data.bin` with the following data:
  - Boolean `true` (1 byte)
  - Byte `123` (1 byte)
  - Char `'A'` (2 bytes, UTF-16 encoding)
  - Double `123.456` (8 bytes)
  - Float `78.9` (4 bytes)
  - Int `1000` (4 bytes)
  - Long `123456789` (8 bytes)
  - Short `50` (2 bytes)
  - UTF String `"Hello, World!"` (variable length)

### Example 2: Reading Data Written by DataOutputStream

```java
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            System.out.println(dis.readBoolean());  // Output: true
            System.out.println(dis.readByte());     // Output: 123
            System.out.println(dis.readChar());     // Output: A
            System.out.println(dis.readDouble());   // Output: 123.456
            System.out.println(dis.readFloat());    // Output: 78.9
            System.out.println(dis.readInt());      // Output: 1000
            System.out.println(dis.readLong());     // Output: 123456789
            System.out.println(dis.readShort());    // Output: 50
            System.out.println(dis.readUTF());      // Output: Hello, World!
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Expected Output**:

```sh
true
123
A
123.456
78.9
1000
123456789
50
Hello, World!
```

## When to Use

- **Binary File Creation**: Use `DataOutputStream` to write binary data to files in a machine-independent format.
- **Data Exchange**: Suitable for writing data that needs to be read by other programs or systems in a binary format.

## Differences from Other Streams

- **ObjectOutputStream**: `ObjectOutputStream` writes objects to a stream and handles serialization, whereas `DataOutputStream` writes primitive data types.
- **BufferedOutputStream**: `BufferedOutputStream` provides buffering capabilities to an output stream, but it does not handle primitive data types in a machine-independent format like `DataOutputStream`.
