# Abstraction in Java

**Abstraction** hides implementation details and exposes only the essential functionality.

## Abstract Class

An abstract class is declared using `abstract` and **cannot be instantiated directly**.

```java
abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

## Abstract Method

An abstract method has **no body** and must be implemented by the child class.

```java
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key.");
    }
}
```

## Key Concepts

* `abstract class` → cannot create its object directly
* `abstract method` → has no method body
* Child classes must implement abstract methods
* Abstract classes can contain both abstract and concrete methods
* `@Override` is recommended when implementing an inherited abstract method

## Abstraction + Runtime Polymorphism

```java
Vehicle v1 = new Car();
Vehicle v2 = new Bike();

v1.start();
v2.start();
```

The parent reference points to different child objects, and the appropriate overridden method is selected at runtime.

### Key Structure

```text
Vehicle (abstract)
       |
   ┌───┴───┐
  Car    Bike
   |       |
 start()  start()
```


