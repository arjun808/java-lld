# Java LLD Interview Prep 🚀

A structured repository to learn and practice **Low-Level Design (LLD)** in Java — from OOP fundamentals to real interview problems.

---

## 📌 Roadmap

| Phase | Topic | Status |
|-------|-------|--------|
| Phase 1 | OOP Foundations | ✅ Done |
| Phase 2 | SOLID Principles | ✅ Done |
| Phase 3 | Design Patterns | 🔄 In Progress |
| Phase 4 | Concurrency in LLD | ⏳ Pending |
| Phase 5 | Core LLD Problems | ⏳ Pending |

---

## 📂 Project Structure

```
java-lld/
│
├── src/
│   │
│   ├── solid/                          # Phase 2 — SOLID Principles
│   │   ├── srp/                        # Single Responsibility Principle
│   │   │   ├── BadExample.java         # Violation example
│   │   │   └── GoodExample.java        # Correct implementation
│   │   ├── ocp/                        # Open Closed Principle
│   │   │   ├── BadExample.java
│   │   │   └── GoodExample.java
│   │   ├── lsp/                        # Liskov Substitution Principle
│   │   │   ├── BadExample.java
│   │   │   └── GoodExample.java
│   │   ├── isp/                        # Interface Segregation Principle
│   │   │   ├── BadExample.java
│   │   │   └── GoodExample.java
│   │   └── dip/                        # Dependency Inversion Principle
│   │       ├── BadExample.java
│   │       └── GoodExample.java
│   │
│   ├── designpatterns/                 # Phase 3 — Design Patterns
│   │   ├── creational/
│   │   │   ├── singleton/
│   │   │   ├── factory/
│   │   │   └── builder/
│   │   ├── structural/
│   │   │   ├── adapter/
│   │   │   └── decorator/
│   │   └── behavioral/
│   │       ├── observer/
│   │       └── strategy/
│   │
│   └── problems/                       # Phase 5 — LLD Interview Problems
│       ├── parkinglot/
│       ├── bookmyshow/
│       ├── splitwise/
│       ├── elevator/
│       ├── snakeandladder/
│       └── atm/
│
└── README.md
```

---

## 📖 Phase 1 — OOP Foundations

Core OOP concepts every LLD interview expects you to know.

| Concept | What it means |
|---------|---------------|
| **Encapsulation** | Private fields + getters/setters. Class controls its own data |
| **Abstraction** | Abstract class — shared code + force subclass to implement some methods |
| **Inheritance** | Child class gets parent's fields and methods for free via `extends` |
| **Polymorphism** | Same method call, different behavior based on which object is called |
| **Interface** | Pure contract — defines WHAT to do, not HOW |

---

## 📖 Phase 2 — SOLID Principles

5 rules for writing clean, maintainable, interview-ready code.

### S — Single Responsibility Principle
> One class should have only one reason to change.

❌ **Violation** — One class doing calculation + printing + saving to DB + sending email  
✅ **Fix** — Separate classes: `Invoice`, `InvoicePrinter`, `InvoiceRepository`, `InvoiceEmailSender`

---

### O — Open Closed Principle
> Open for extension, closed for modification.

❌ **Violation** — Adding new payment type means editing existing `if-else` chain  
✅ **Fix** — `PaymentMethod` interface + separate class per payment type. New type = new class only

---

### L — Liskov Substitution Principle
> Child class should work wherever parent class is used, without breaking anything.

❌ **Violation** — `Penguin extends Bird` but `fly()` throws exception  
✅ **Fix** — Separate `Flyable` interface. Penguin extends `Bird` but doesn't implement `Flyable`

---

### I — Interface Segregation Principle
> Don't force a class to implement methods it doesn't need.

❌ **Violation** — One big `RestaurantWorker` interface with `takeOrder + cookFood + cleanTables + manageBilling`  
✅ **Fix** — Small focused interfaces: `OrderTaker`, `FoodCooker`, `TableCleaner`, `BillingManager`

---

### D — Dependency Inversion Principle
> Depend on abstractions, not concrete classes.

❌ **Violation** — `OrderService` directly creates `EmailNotification` inside itself  
✅ **Fix** — `Notification` interface injected via constructor. `OrderService` never knows which notification is used

---

## 🎯 Phase 5 — LLD Interview Problems

| Problem | Concepts Used | Status |
|---------|--------------|--------|
| Parking Lot | Enums, Inheritance, Singleton | ⏳ Pending |
| BookMyShow | Collections, OCP, Relationships | ⏳ Pending |
| Splitwise | HashMap, OOP, SRP | ⏳ Pending |
| Elevator System | State Pattern, Enums | ⏳ Pending |
| Snake and Ladder | OOP, Randomization | ⏳ Pending |
| ATM System | State Pattern, Singleton | ⏳ Pending |

---

## 🛠️ How to Run

### VS Code
1. Install [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
2. Open any `.java` file
3. Click **Run** button that appears above `main()`

### IntelliJ IDEA
1. Download [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/) (free)
2. Open the `java-lld` folder as a project
3. Right click any file → **Run**

### Terminal
```bash
# Compile
javac src/solid/srp/GoodExample.java

# Run
java -cp src solid.srp.GoodExample
```

---

## 💡 Key Java Rules to Remember

```java
// 1. File name must match class name
// GoodExample.java → public class GoodExample

// 2. String compare — never use ==
str.equals("hello");       // ✅ correct
str == "hello";            // ❌ wrong

// 3. All code must be inside a class
// No free-floating functions like C++

// 4. Import before using collections
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;        // import everything

// 5. Always use new to create objects
Car c = new Car("BMW", 100);
```

---

## 📝 Notes

- Each `BadExample.java` shows what **NOT** to do and why
- Each `GoodExample.java` shows the correct implementation
- Real-world analogies used: Swiggy, Ola, Uber, Zomato, Restaurant

---

*Learning Java LLD from scratch — one principle at a time* 🎯