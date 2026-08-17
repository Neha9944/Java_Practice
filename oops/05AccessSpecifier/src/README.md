# Access Specifiers in Java

Access specifiers control the **visibility and accessibility** of classes, variables, methods, and constructors.

### Types

| Modifier    | Access                    |
| ----------- | ------------------------- |
| `private`   | Same class only           |
| `default`   | Same package              |
| `protected` | Same package + subclasses |
| `public`    | Everywhere                |

### Example

```java
private String name;
int age;                  // default
protected String course;
public int marks;
```

### Practice Covered

* `private`, `default`, `protected`, `public`
* Same-package access
* Cross-package access
* `protected` with inheritance
* Java packages and imports

### Key Rule

```text
private   → Class
default   → Package
protected → Package + Child
public    → Everywhere
```

