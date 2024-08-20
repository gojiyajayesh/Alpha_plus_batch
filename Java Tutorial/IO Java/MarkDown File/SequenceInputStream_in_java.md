# SequenceInputStream Class in Java

## Overview

The `SequenceInputStream` class in Java is a type of `InputStream` that allows concatenation of multiple input streams into a single stream. This class is useful when you need to read data from multiple sources sequentially as if they were a single stream.

## Constructors

### 1. `SequenceInputStream(InputStream s1, InputStream s2)`

```java
SequenceInputStream(InputStream s1, InputStream s2)
```

- **Parameters**:

  - `s1`: The first input stream.
  - `s2`: The second input stream.

- **Description**:
  - Creates a `SequenceInputStream` to read from two input streams `s1` and `s2` sequentially. After `s1` is exhausted, it reads from `s2`.

### 2. `SequenceInputStream(Enumeration<? extends InputStream> e)`

```java
SequenceInputStream(Enumeration<? extends InputStream> e)
```

- **Parameters**:

  - `e`: An `Enumeration` of `InputStream` objects.

- **Description**:
  - Creates a `SequenceInputStream` to read from an enumeration of input streams. The streams are read sequentially as provided by the enumeration.

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

`SequenceInputStream` reads data from the input streams sequentially. When the first input stream is exhausted (reaches end-of-stream), it automatically switches to the second input stream, and so on. When an enumeration is used, the streams are read in the order they are provided by the enumeration.

## When to Use

- **Concatenation**: Use `SequenceInputStream` when you need to concatenate multiple input streams and read them as a single stream.
- **Stream Management**: It simplifies managing multiple streams by treating them as a single continuous stream.

## Differences from Other Streams

- **InputStream**: `InputStream` is the base class for all input streams and does not provide stream concatenation. `SequenceInputStream` extends `InputStream` to provide concatenation functionality.
- **FileInputStream**: `FileInputStream` reads data from files, but does not provide functionality to concatenate multiple streams. `SequenceInputStream` can be used to concatenate multiple `FileInputStream` objects or any other input streams.
