# ✈️ AeroCode Airlines – Java Console-Based Airline Management System

## 📌 Project Overview

**AeroCode Airlines** is a console-based Java application that simulates a simplified airline reservation and management system. The system provides an interactive user interface in the terminal using colored prompts and structured menus. Data is stored and retrieved from CSV files, allowing persistent storage without databases.

---

## 🎯 Features

- 🔍 View available airline details
- 🎫 Book, view, and cancel flight tickets
- 👤 Manage passenger data
- 📦 Read/write persistent data using `.csv` files
- 🌈 Colored console outputs for enhanced UX
- 🧹 Clean modular code using object-oriented principles

---

## 🗂️ Project Structure

```
AeroCode_airlines/
│
├── AeroCode_Airlines_main.java     # Main application logic
├── Colours.java                    # Console color helper class
├── airline_data.csv                # Stores flight data
├── passenger_data.csv              # Stores passenger data
```

---

## 🧑‍💻 How to Run

### ✅ Prerequisites:
- Java JDK 8 or above
- Command-line terminal (Linux/macOS/Windows)

### 🔧 Compilation

1. Navigate to the project folder:
   ```bash
   cd AeroCode_airlines
   ```

2. Compile both Java files:
   ```bash
   javac Colours.java AeroCode_Airlines_main.java
   ```

3. Run the program from the PARENT directory:
   ```bash
   java AeroCode_airlines.AeroCode_Airlines_main
   ```

---

## 📁 Data Files

- `airline_data.csv`: Contains details of all flights (e.g., ID, source, destination, timings)
- `passenger_data.csv`: Tracks booked passengers with ticket IDs, names, and associated flights

Both files are read/written during runtime to persist information between sessions.

---

## 🌈 Colours.java Utility

To enhance visual clarity, `Colours.java` defines ANSI escape codes like:

```java
public static final String BLUE = "\u001B[34m";
public static final String GREEN = "\u001B[32m";
public static final String RESET = "\u001B[0m";
```

Used in print statements like:
```java
System.out.print(Colours.GREEN + "Enter your choice: " + Colours.RESET);
```

---

## 📌 Sample Features Implemented

- Menu-driven interface for:
  - Adding/viewing airline data
  - Booking/canceling tickets
  - Searching flights by source/destination
  - Exiting gracefully with thank-you message

---

## 🚀 Future Improvements

- Add login/authentication system
- Integrate with a real database (e.g., MySQL)
- GUI version using JavaFX or Swing
- Online ticket booking via web interface

---

## 👤 Developed By

**Devansh Kukadia**  
Bachelor of Technology – Mathematics and Computing  
DA-IICT, 2025

---

## 📜 License

This project is for academic use only. Feel free to fork and modify with credits.
