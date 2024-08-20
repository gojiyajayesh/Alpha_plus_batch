# FilterInputStream Class in Java

## Overview

The `FilterInputStream` class in Java is an abstract class that serves as a base class for input stream filters. It extends `InputStream` and provides a framework for implementing additional functionality on top of an existing input stream. By using `FilterInputStream`, you can create custom input streams that enhance or modify the behavior of an underlying stream.

## Constructors

### 1. `FilterInputStream(InputStream in)`

```java
FilterInputStream(InputStream in)
```

- **Parameters**:

  - `in`: The underlying input stream to be filtered.

- **Description**:
  - Creates a `FilterInputStream` that filters data from the specified input stream.

## Methods

### 1. `int read()`

```java
int read() throws IOException
```

- **Description**:
  - Reads the next byte of data from the input stream. Returns the byte read, or -1 if the end of the stream is reached.

### 2. `int read(byte[] b)`

```java
int read(byte[] b) throws IOException
```

- **Parameters**:

  - `b`: The byte array into which the data is read.

- **Description**:
  - Reads up to `b.length` bytes of data from the input stream into the byte array. Returns the number of bytes read, or -1 if the end of the stream is reached.

### 3. `int read(byte[] b, int off, int len)`

```java
int read(byte[] b, int off, int len) throws IOException
```

- **Parameters**:

  - `b`: The byte array into which the data is read.
  - `off`: The start offset in the data array.
  - `len`: The maximum number of bytes to read.

- **Description**:
  - Reads up to `len` bytes of data from the input stream into the byte array starting at offset `off`. Returns the number of bytes read, or -1 if the end of the stream is reached.

### 4. `long skip(long n)`

```java
long skip(long n) throws IOException
```

- **Parameters**:

  - `n`: The number of bytes to skip.

- **Description**:
  - Skips over and discards `n` bytes of data from the input stream. Returns the actual number of bytes skipped.

### 5. `int available()`

```java
int available() throws IOException
```

- **Description**:
  - Returns an estimate of the number of bytes that can be read from the input stream without blocking.

### 6. `void close()`

```java
void close() throws IOException
```

- **Description**:
  - Closes the underlying input stream and releases any system resources associated with it.

## Example Usage

### Example 1: Custom FilterInputStream

In this example, we create a custom `FilterInputStream` that converts all characters read from the stream to uppercase before returning them.

```java
import java.io.FilterInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseFilterInputStream extends FilterInputStream {

    public UpperCaseFilterInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int b = super.read();
        if (b == -1) return -1;
        return Character.toUpperCase(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int bytesRead = super.read(b, off, len);
        if (bytesRead == -1) return -1;
        for (int i = off; i < off + bytesRead; i++) {
            b[i] = (byte) Character.toUpperCase(b[i]);
        }
        return bytesRead;
    }

    public static void main(String[] args) {
        try (UpperCaseFilterInputStream ufis = new UpperCaseFilterInputStream(new FileInputStream("input.txt"))) {
            int c;
            while ((c = ufis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Expected Output**:

- If `input.txt` contains `"Hello World!"`, the output will be `"HELLO WORLD!"`.

### Example 2: Using FilterInputStream with a BufferedInputStream

In this example, we use `FilterInputStream` to wrap a `BufferedInputStream` for enhanced performance.

```java
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedFilterInputStreamExample {

    public static void main(String[] args) {
        try (FilterInputStream fis = new BufferedInputStream(new FileInputStream("buffered_input.txt"))) {
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Expected Output**:

- If `buffered_input.txt` contains `"Buffered Input Stream Example"`, the output will be `"Buffered Input Stream Example"`.

## When to Use

- **Custom Behavior**: Use `FilterInputStream` when you need to add custom behavior or functionality to an existing input stream.
- **Decorators**: It is useful for creating decorator patterns that enhance or modify the behavior of input streams.

## Differences from Other Streams

- **InputStream**: `FilterInputStream` is a subclass of `InputStream` that adds filtering capabilities, while `InputStream` provides basic methods for reading bytes.
- **DataInputStream**: `DataInputStream` is a specialized `FilterInputStream` that provides methods for reading primitive data types in a machine-independent format.
