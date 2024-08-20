# FilterOutputStream Class in Java

## Overview

The `FilterOutputStream` class in Java is an abstract class that serves as a base class for output stream filters. It extends `OutputStream` and provides a framework for implementing additional functionality on top of an existing output stream. By using `FilterOutputStream`, you can create custom output streams that enhance or modify the behavior of an underlying stream.

## Constructors

### 1. `FilterOutputStream(OutputStream out)`

```java
FilterOutputStream(OutputStream out)
```

- **Parameters**:

  - `out`: The underlying output stream to be filtered.

- **Description**:
  - Creates a `FilterOutputStream` that filters data to the specified output stream.

## Methods

### 1. `void write(int b)`

```java
void write(int b) throws IOException
```

- **Parameters**:

  - `b`: The byte to write.

- **Description**:
  - Writes a single byte to the underlying output stream.

### 2. `void write(byte[] b)`

```java
void write(byte[] b) throws IOException
```

- **Parameters**:

  - `b`: The byte array to write.

- **Description**:
  - Writes an array of bytes to the underlying output stream.

### 3. `void write(byte[] b, int off, int len)`

```java
void write(byte[] b, int off, int len) throws IOException
```

- **Parameters**:

  - `b`: The byte array to write.
  - `off`: The start offset in the data.
  - `len`: The number of bytes to write.

- **Description**:
  - Writes a portion of an array of bytes to the underlying output stream.

### 4. `void flush()`

```java
void flush() throws IOException
```

- **Description**:
  - Flushes the underlying output stream.

### 5. `void close()`

```java
void close() throws IOException
```

- **Description**:
  - Closes the underlying output stream.

## Example Usage

### Example 1: Custom FilterOutputStream

In this example, we create a custom `FilterOutputStream` that converts all characters to uppercase before writing them to the underlying output stream.

```java
import java.io.FilterOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class UpperCaseFilterOutputStream extends FilterOutputStream {

    public UpperCaseFilterOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        // Convert byte to uppercase if it is a lowercase letter
        if (b >= 'a' && b <= 'z') {
            b = b - ('a' - 'A');
        }
        super.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        for (int i = off; i < off + len; i++) {
            if (b[i] >= 'a' && b[i] <= 'z') {
                b[i] = (byte) (b[i] - ('a' - 'A'));
            }
        }
        super.write(b, off, len);
    }

    public static void main(String[] args) {
        try (UpperCaseFilterOutputStream ufos = new UpperCaseFilterOutputStream(new FileOutputStream("output.txt"))) {
            ufos.write("Hello World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Expected Output**:

- The content of `output.txt` will be `"HELLO WORLD!"`.

### Example 2: Using FilterOutputStream with a BufferedOutputStream

In this example, we use `FilterOutputStream` to wrap a `BufferedOutputStream` for enhanced performance.

```java
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedFilterOutputStreamExample {

    public static void main(String[] args) {
        try (FilterOutputStream fos = new BufferedOutputStream(new FileOutputStream("buffered_output.txt"))) {
            fos.write("Buffered Output Stream Example".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Expected Output**:

- The content of `buffered_output.txt` will be `"Buffered Output Stream Example"`.

## When to Use

- **Custom Behavior**: Use `FilterOutputStream` when you need to add custom behavior or functionality to an existing output stream.
- **Decorators**: It is useful for creating decorator patterns that enhance or modify the behavior of output streams.

## Differences from Other Streams

- **OutputStream**: `FilterOutputStream` is a subclass of `OutputStream` that adds filtering capabilities, while `OutputStream` provides basic methods for writing bytes.
- **DataOutputStream**: `DataOutputStream` is a specialized `FilterOutputStream` that provides methods for writing primitive data types in a binary format.
