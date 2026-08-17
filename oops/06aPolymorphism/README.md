# Polymorphism in Java

**Polymorphism** means **"many forms"**. It allows the same method name to behave differently.

## Types of Polymorphism

### 1. Compile-Time Polymorphism

Achieved through **Method Overloading**.

```java
int multiply(int a, int b)
int multiply(int a, int b, int c)
```

Same method name with different parameters.

**Example:**

```java
Calculator c = new Calculator();

c.add(10, 20);
c.add(10, 20, 30);
```

### 2. Runtime Polymorphism

Achieved through **Method Overriding**.

```java
Animal a = new Dog();
a.sound();
```

The method of the actual object (`Dog`) is executed at runtime.

## Quick Comparison

| Type         | Achieved By        | Decision     |
| ------------ | ------------------ | ------------ |
| Compile-time | Method Overloading | Compile time |
| Runtime      | Method Overriding  | Runtime      |

## Key Concepts

* Overloading → same method name, different parameters
* Overriding → child class provides its own implementation
* `@Override` → recommended for overridden methods
* Runtime polymorphism uses **parent reference + child object**

### Key Pattern

```java
Animal a = new Dog();
a.sound();
```


