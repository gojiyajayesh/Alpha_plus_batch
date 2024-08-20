# FilePermission Class in Java

## Overview

The `FilePermission` class in Java is part of the `java.io` package and is used to specify access permissions for files or directories. It is a part of Java's security framework and is used to control the file system permissions granted to code running under a particular security manager. It helps in managing what operations are allowed on specific files or directories.

## Constructors

### 1. `FilePermission(String path, String actions)`

```java
FilePermission(String path, String actions)
```

- **Parameters**:

  - `path`: The file or directory path to which the permissions apply.
  - `actions`: A string specifying the permitted actions. The possible values are `"read"`, `"write"`, `"execute"`, `"delete"`, and combinations of these actions.

- **Description**:
  - Creates a `FilePermission` object with the specified path and actions.

## Key Methods

### 1. `String getActions()`

```java
String getActions()
```

- **Description**:
  - Returns a string representing the set of actions allowed by this `FilePermission`.

### 2. `boolean implies(Permission permission)`

```java
boolean implies(Permission permission)
```

- **Parameters**:

  - `permission`: The permission to check against.

- **Description**:
  - Tests if this `FilePermission` implies the specified permission. Returns `true` if this `FilePermission` implies the specified permission; otherwise, returns `false`.

### 3. `boolean equals(Object obj)`

```java
boolean equals(Object obj)
```

- **Parameters**:

  - `obj`: The object to compare this permission with.

- **Description**:
  - Compares this `FilePermission` object to the specified object. Returns `true` if they are equal; otherwise, returns `false`.

### 4. `int hashCode()`

```java
int hashCode()
```

- **Description**:
  - Returns a hash code value for this `FilePermission` object.

## Example Usage

### Example 1: Creating and Using FilePermission

In this example, we create a `FilePermission` object and check if it allows certain actions.

```java
import java.io.FilePermission;
import java.security.Permission;

public class FilePermissionExample {
    public static void main(String[] args) {
        // Create FilePermission object
        FilePermission permission = new FilePermission("example.txt", "read, write");

        // Print the allowed actions
        System.out.println("Allowed Actions: " + permission.getActions());

        // Check if the permission implies another permission
        FilePermission readPermission = new FilePermission("example.txt", "read");
        System.out.println("Implies read permission: " + permission.implies(readPermission));
    }
}
```

**Expected Output**:

```sh
Allowed Actions: read, write
Implies read permission: true
```

### Example 2: Using FilePermission with SecurityManager

In this example, we use `FilePermission` with a `SecurityManager` to enforce file access controls.

```java
import java.io.FilePermission;
import java.security.Permission;
import java.security.SecurityManager;

public class SecurityManagerExample {
    public static void main(String[] args) {
        // Create a SecurityManager with FilePermission
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPermission(Permission perm) {
                if (perm instanceof FilePermission) {
                    FilePermission filePerm = (FilePermission) perm;
                    System.out.println("Checking permission for: " + filePerm.getName() + " with actions: " + filePerm.getActions());
                }
            }
        });

        // Check permission
        FilePermission perm = new FilePermission("example.txt", "read, write");
        System.getSecurityManager().checkPermission(perm);
    }
}
```

**Expected Output**:

```sh
Checking permission for: example.txt with actions: read, write
```

## When to Use

- **Security Policies**: Use `FilePermission` when defining security policies that control access to files and directories.
- **Custom Security Managers**: Useful when implementing custom `SecurityManager` instances to enforce file system access restrictions.

## Differences from Other Classes

- **Permission**: `FilePermission` extends `Permission` and is specifically used for file system permissions.
- **java.nio.file.Path**: While `Path` represents file paths in the NIO package, `FilePermission` is used for defining and checking file access permissions.
