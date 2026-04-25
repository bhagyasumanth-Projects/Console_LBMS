# Console_LBMS
I tested my knowledge on OOPS by developing a console based Library Management System. It helps me a lot to understand the 4 pillars of OOPS (Encapsulation,Abstraction,Inheritence,Polymorphism). To know more about the project go through the complete README file.

# 📚 Library Management System

A console-based **Library Management System** built in Java, demonstrating all four pillars of **Object-Oriented Programming (OOP)** — Encapsulation, Inheritance, Polymorphism, and Abstraction.

---

## 🧱 OOP Concepts Used

| Pillar | Where Applied |
|---|---|
| **Encapsulation** | All fields are `private` with getters/setters in every class |
| **Inheritance** | `Book` and `Magazine` extend `LibraryItem` |
| **Polymorphism** | `borrow()` and `returnItem()` behave differently per item type |
| **Abstraction** | `abstract class LibraryItem` + `interface Borrowable` |

---

## 🗂️ Project Structure

```
LibraryManagementSystem/
│
├── Main.java                  ← Entry point
│
├── Borrowable.java            ← Interface: borrow() and returnItem()
├── LibraryItem.java           ← Abstract base class for all library items
├── Book.java                  ← Extends LibraryItem, implements Borrowable
├── Magazine.java              ← Extends LibraryItem, implements Borrowable
├── Member.java                ← Represents a library member
└── Library.java               ← Manages catalog, search, and borrow tracking
```

---

## 🏗️ Class Architecture

```
interface Borrowable
        ↑ implements
abstract class LibraryItem
        ↑ extends
   ┌────┴────┐
 Book     Magazine

class Member   → holds ArrayList<LibraryItem> of borrowed items
class Library  → holds ArrayList<LibraryItem> catalog + static borrow count
```

---

## ✨ Features

- ✅ Add books and magazines to the library catalog
- ✅ Borrow items — checks availability before borrowing
- ✅ Return items — marks item as available again
- ✅ View each member's currently borrowed items
- ✅ Search for any item by title (case-insensitive)
- ✅ Track total number of borrows across all members (static counter)
- ✅ Print full library catalog with availability status

---

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or above installed
- Any IDE (IntelliJ IDEA / VS Code / Eclipse) or terminal

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/your-username/LibraryManagementSystem.git
cd LibraryManagementSystem
```

**2. Compile**
```bash
javac Main.java
```

**3. Run**
```bash
java Main
```

---

## 🖥️ Sample Output

```
====== WELCOME TO Smart Library ======

========== Catalog ===========
[Book] Harry Potter | J.K Rowling | Available: true
[Book] The Alchemist | Paulo Coelho | Available: true
[Magazine] National Geographic | Various | Available: true
==============================

Harry Potter borrowed by Sumanth
The Alchemist borrowed by Ravi
National Geographic borrowed by Sumanth
Harry Potter is not available!

===== Sumanth's Borrowed Items =====
- Harry Potter
- National Geographic
=====================================

===== Ravi's Borrowed Items =====
- The Alchemist
=====================================

Found : The Alchemist

Total borrows : 3
```

---

## 📦 Class Descriptions

### `interface Borrowable`
Defines the borrowing contract. Any class that implements this **must** provide:
- `void borrow(Member member)` — borrow the item
- `void returnItem(Member member)` — return the item

---

### `abstract class LibraryItem`
Base class for all items in the library.

| Field | Type | Description |
|---|---|---|
| `title` | `String` | Title of the item |
| `author` | `String` | Author / publisher |
| `itemId` | `String` | Unique identifier |
| `available` | `boolean` | Availability status |

| Method | Description |
|---|---|
| `abstract getType()` | Returns item type — overridden by children |
| `isAvailable()` | Returns current availability |
| `setAvailable(boolean)` | Updates availability |

---

### `class Book extends LibraryItem implements Borrowable`
Represents a book in the library.

| Field | Type | Description |
|---|---|---|
| `genre` | `String` | Book genre (e.g. Fantasy, Fiction) |

---

### `class Magazine extends LibraryItem implements Borrowable`
Represents a magazine in the library.

| Field | Type | Description |
|---|---|---|
| `issueNumber` | `int` | Magazine issue number |

---

### `class Member`
Represents a library member who can borrow items.

| Field | Type | Description |
|---|---|---|
| `name` | `String` | Member's name |
| `memId` | `String` | Unique member ID |
| `borrowedItems` | `ArrayList<LibraryItem>` | Currently borrowed items |

| Method | Description |
|---|---|
| `borrowItem(item)` | Adds item to member's borrowed list |
| `returnItem(item)` | Removes item from member's borrowed list |
| `printBorrowedItems()` | Prints all currently borrowed items |

---

### `class Library`
Manages the entire library system.

| Field | Type | Description |
|---|---|---|
| `libraryName` | `static String` | Name of the library (shared) |
| `totalBorrowCount` | `static int` | Total borrows across all members |
| `catalog` | `ArrayList<LibraryItem>` | All items in the library |

| Method | Description |
|---|---|
| `addItem(item)` | Adds item to catalog |
| `searchByTitle(title)` | Finds item by title (case-insensitive) |
| `printCatalog()` | Prints all items with availability |
| `getTotalBorrowCount()` | Returns total borrow count |
| `incrementBorrowCount()` | Increments borrow counter |

---

## 🧠 Key Java Concepts Demonstrated

```java
// 1. Abstract class — cannot be instantiated directly
abstract class LibraryItem { ... }
new LibraryItem(...); // ❌ compile error

// 2. Interface — defines a contract
interface Borrowable {
    void borrow(Member member);     // no body
    void returnItem(Member member); // no body
}

// 3. Multiple implementation
class Book extends LibraryItem implements Borrowable { ... }

// 4. Static field — shared across all Library instances
static int totalBorrowCount = 0;

// 5. Runtime Polymorphism — correct borrow() called at runtime
LibraryItem item = new Book(...);
item.borrow(member); // calls Book's borrow(), not Magazine's
```

---

## 🔮 Future Enhancements

- [ ] Add due dates and fine calculation for overdue items
- [ ] Implement file I/O to persist library data
- [ ] Add a `DVD` class extending `LibraryItem`
- [ ] Build a GUI using Java Swing
- [ ] Add member registration with ID validation
- [ ] Implement search by author name

---

## 👨‍💻 Author

**Sumanth**
- 📅 Built as part of a 14-Day Java Learning Roadmap
- 🎯 Day 1 Project — OOP Concepts in Java
- 🔗 GitHub: [github.com/your-username](https://github.com/your-username)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
