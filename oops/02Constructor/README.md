# Java Constructors

## 📌 Overview

A **constructor** in Java is a special method used to **initialize objects**. It is automatically called when an object is created.

## 🔹 Key Points

* Constructor name must be the **same as the class name**.
* It does **not have a return type**, not even `void`.
* It is called automatically when an object is created using `new`.
* Constructors are mainly used to initialize instance variables.
* A class can have **multiple constructors** using constructor overloading.

## 🔹 Types of Constructors

### 1. Default Constructor

If no constructor is explicitly defined, Java provides a default constructor.

```java
class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.name);
        System.out.println(s.age);
    }
}
```

### 2. No-Argument Constructor

A constructor defined by the programmer without parameters.

```java
class Student {

    Student() {
        System.out.println("Constructor called");
    }
}
```

### 3. Parameterized Constructor

A constructor that accepts parameters to initialize an object with specific values.

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Alex", 25);

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
```

## 🔹 Constructor Overloading

Multiple constructors can exist in the same class with different parameter lists.

```java
class Student {

    Student() {
        System.out.println("No-argument constructor");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }

    Student(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

## 🔹 Constructor vs Method

| Constructor                    | Method                  |
| ------------------------------ | ----------------------- |
| Same name as class             | Can have any valid name |
| No return type                 | Can have a return type  |
| Called automatically           | Called explicitly       |
| Initializes objects            | Performs an operation   |
| Invoked when object is created | Invoked when called     |

## 🎯 Important Syntax

```java
class ClassName {

    ClassName(parameters) {
        // initialization
    }
}
```


