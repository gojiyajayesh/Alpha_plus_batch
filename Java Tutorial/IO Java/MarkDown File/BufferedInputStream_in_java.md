# BufferedInputStream in Java

## Overview

`BufferedInputStream` is a subclass of `FilterInputStream` in Java that provides buffering for an input stream. It reads data in chunks, which can reduce the number of I/O operations and improve performance compared to reading one byte at a time.

## Constructors

`BufferedInputStream` has the following constructors:

### 1. `BufferedInputStream(InputStream in)`

```java
BufferedInputStream(InputStream in)
```

- **Parameters**:

  - `in`: The underlying input stream to be buffered.

- **Description**:
  - Creates a buffered input stream with a default buffer size.

### 2. `BufferedInputStream(InputStream in, int size)`

```java
BufferedInputStream(InputStream in, int size)
```

- **Parameters**:

  - `in`: The underlying input stream to be buffered.
  - `size`: The size of the buffer to be used.

- **Description**:
  - Creates a buffered input stream with a specified buffer size.

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

- **Description**:
  - Reads up to `b.length` bytes of data into an array of bytes from the input stream. Returns the number of bytes read, or -1 if the end of the stream is reached.

### 3. `int read(byte[] b, int off, int len)`

```java
int read(byte[] b, int off, int len) throws IOException
```

- **Description**:
  - Reads up to `len` bytes of data into an array of bytes from the input stream, starting at the offset `off`. Returns the number of bytes read, or -1 if the end of the stream is reached.

### 4. `void close()`

```java
void close() throws IOException
```

- **Description**:
  - Closes the input stream and releases any system resources associated with it.

## How It Works

`BufferedInputStream` works by using an internal buffer to read chunks of data from the underlying input stream. When data is requested, it first checks the buffer. If the buffer has data, it returns it; otherwise, it reads a new chunk from the underlying stream and fills the buffer. This reduces the number of I/O operations compared to reading byte by byte.

## When to Use

- **Performance**: Use `BufferedInputStream` when you want to improve the performance of input operations, especially when dealing with large files or slow I/O devices.
- **Efficiency**: It is particularly useful when you need to read data in larger chunks rather than byte-by-byte.

## Differences from Other Streams

- **InputStream**: `InputStream` is the base class for all input streams. It provides basic methods for reading bytes, but does not include buffering. `BufferedInputStream` adds buffering capabilities on top of `InputStream`.
- **FileInputStream**: `FileInputStream` is a subclass of `InputStream` used specifically for reading files. It does not include buffering by default, so wrapping it in a `BufferedInputStream` can enhance performance.
- **DataInputStream**: `DataInputStream` is another subclass of `InputStream` that provides methods to read Java data types (e.g., `int`, `float`). It does not inherently provide buffering, so `BufferedInputStream` can be used to improve performance.
