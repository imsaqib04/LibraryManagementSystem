# 📚 Library Management System (Java CLI)

A simple **Java-based Library Management System** developed as a console application using **Object-Oriented Programming (OOP)** principles. It allows users to manage a collection of books and perform actions as an **Admin** or **User**.

---

## ✅ Features

### 👮 Admin Panel
- Add new books to the library 📖
- View all books available in the system 📚

### 👤 User Panel
- View list of available and issued books 👁️
- Issue a book (if available) 🟢
- Return an issued book 🔁

---

## 🛠️ Tech Stack

- **Language**: Java (JDK 17+ or JDK 21 recommended)
- **Tools**: VS Code / IntelliJ IDEA / Terminal
- **Concepts Used**:
  - Classes & Objects
  - Constructors
  - ArrayLists
  - If-else, loops
  - Basic CLI interaction

---

## 📁 Project Structure

LibraryManagementSystem

├── Book.java // Book model with issue/return logic

├── User.java // User model (admin/user roles)

├── Library.java // Main library logic (book list & actions)

└── Main.java // Main class with CLI menu


---

## 🚀 Getting Started

### 1. Clone the Repository

git clone https://github.com/imsaqib04/LibraryManagementSystem.git

## 2.GO to path

cd LibraryManagementSystem

## 3.Compile the Code
javac *.java
## 4.Run the Application
java Main


🔎 Sample Usage

=== Welcome to Library Management System ===
1. Login as Admin
2. Login as User
0. Exit
Enter your choice:

Admins can add books, users can issue or return them — all from the terminal.

📌 Notes
Pre-loaded books are added silently at startup.

Only Admin can add new books manually.

Book issue/return is case-insensitive by title.

🙋‍♂️ Author : 
 Saqib

GitHub: @imsaqib04

