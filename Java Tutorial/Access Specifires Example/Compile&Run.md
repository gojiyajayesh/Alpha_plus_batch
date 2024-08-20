# Compiling and Running Java Classes

## Steps to Compile and Run

### Navigate to the `AccessSpecifiers` directory

```sh
cd path_to_AccessSpecifiers
```

### Compile all Java files

```sh
javac mainPackage/MainClass.java mainPackage/SecondClass.java secondPackage/DiffFirst.java secondPackage/DiffSecond.java
```

### Run the classes

- To run `SecondClass`:

  ```sh
  java mainPackage.SecondClass
  ```

- To run `DiffFirst`:

  ```sh
  java secondPackage.DiffFirst
  ```

- To run `DiffSecond`:

  ```sh
  java secondPackage.DiffSecond
  ```

## Source Code

### MainClass.java

```java
package mainPackage;

public class MainClass {
    String defaultVaribale = "Default";
    protected String protectedVaribale = "protected";
    public String publicVaribale = "public";

    private void privateMethod() {
        System.out.println("Private Methos called!!");
    }

    void defaultMethod() {
        System.out.println("default Methos called!!");
    }

    protected void protectedMethod() {
        System.out.println("protected Methos called!!");
    }

    public void publicMethod() {
        System.out.println("public Methos called!!");
    }

    public MainClass() {
        System.out.println("this is a private constructor called!");
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();

        main.privateMethod();     // Access private method with in same class
        main.defaultMethod();     // Access default methos with in same class & same package
        main.protectedMethod();   // Access protected method with in same class & same package & diffrent package sub class
        main.publicMethod();      // Access public method in anywhare
    }
}
```

### SecondClass.java

```java
package mainPackage;

public class SecondClass {
    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.defaultMethod(); // Default method is called in same class & same class
        main.protectedMethod(); // Protected method is called in same class & same package & diffrent package subclass
        main.publicMethod(); // Public method is called in any whare
    }
}
```

### DiffFirst.java

```java
package secondPackage;

import mainPackage.MainClass;

public class DiffFirst extends MainClass {
    public static void main(String[] args) {
        DiffFirst main = new DiffFirst();
        main.protectedMethod(); // Access Protected method same class same package and diffrent package sub class
    }
}
```

### DiffSecond.java

```java
package secondPackage;

import mainPackage.*;

public class DiffSecond {
    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.publicMethod(); // Only Public method are access this because diffrent package and without sub
                             // class this is a not access in this form
    }
}
```
