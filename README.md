# 🎓 Student Grade Management System

A simple **Java console-based application** to manage student records, calculate grades, and display information.  
This project demonstrates **core Java concepts** including arrays, classes, objects, constructors, encapsulation, inheritance, polymorphism, abstraction, recursion, and the use of `static` and `final` keywords.

---

## 🚀 Features
- Add new students with marks in multiple subjects
- Automatically calculate average and grade (A/B/C/D/F)
- Search students by **ID** or **Name**
- Remove student records
- Display all student details
- Menu-driven console interface

---

## 🏗 Project Structure
- **Student.java**
    - Holds student details (`id`, `name`, `marks`, `average`, `grade`)
    - Auto-generates unique IDs using a static counter
    - Methods to calculate average and grade
    - Getters for ID, name, average, and grade
    - `displayInfo()` method to print student details

- **GradeManager.java**
    - Manages an array of `Student` objects
    - Methods to add, remove, search, and display students
    - Uses `count` to track the number of active students

- **Main.java**
    - Entry point of the program
    - Provides a **menu-driven interface** using `Scanner`
    - Calls methods from `GradeManager` based on user input

---

## 📂 Class Diagram (Simplified)

Main

└── GradeManager

└── Student

- `Main` → interacts with the user
- `GradeManager` → manages student records
- `Student` → represents individual student data

---

## 🛠 How to Run
1. Clone or download the project files.
2. Compile all `.java` files:
   ```bash
   javac Main.java Student.java GradeManager.java
3.  Run the program:


    java Main

4. Use the menu to add, search, remove, or display students.





**Authour**: Tanmoy Sarkar