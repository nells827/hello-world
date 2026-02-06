# Car Rental System - Java Project

> A Java-based Car Rental System built using Object-Oriented Programming (OOP) principles with a secure login system, password masking, and modular vehicle management.

## Table of Contents

- [Prerequisites & Installation](#prerequisites--installation)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Features](#features)
- [Default Credentials](#default-credentials)

## Prerequisites & Installation

### 1. Java Development Kit (JDK)

The project requires JDK to be installed on your system.

**Download:**
- [Oracle JDK Download Page](https://www.oracle.com/java/technologies/downloads/)
- [Adoptium (OpenJDK)](https://adoptium.net/)

**Minimum Version:** JDK 17 or higher

**Verification:**
```bash
java -version
javac -version
```

Both commands should return a version number if installation is successful.

### 2. VS Code Setup

1. Download [Visual Studio Code](https://code.visualstudio.com/)
2. Install the **Extension Pack for Java** by Microsoft
   - Open Extensions view (`Ctrl+Shift+X`)
   - Search for "Extension Pack for Java"
   - Click Install

## Project Structure

All files should be saved in a single folder:

```
CarRentalSystem/
├── Main.java              # Application entry point and menu system
├── LoginSystem.java       # User authentication with password masking
├── Car.java               # Vehicle entity class
├── RentalAgency.java      # Fleet and transaction management
└── README.md              # This file
```

### File Descriptions

| File | Purpose |
|------|---------|
| `Main.java` | Entry point handling application loop and user menu |
| `LoginSystem.java` | Authentication with 3-attempt limit and password masking |
| `Car.java` | Vehicle entity with rental information |
| `RentalAgency.java` | Controller managing fleet and transactions |

## How to Run

### Step 1: Open the Project

1. Launch VS Code
2. Select `File` → `Open Folder`
3. Choose your `CarRentalSystem` folder

### Step 2: Compile the Code

Use the integrated terminal instead of the Run button to support password masking:

1. Open the Integrated Terminal (`Ctrl + ` `)
2. Compile all files:
   ```bash
   javac *.java
   ```

### Step 3: Run the Application

```bash
java Main
```

## Features

| Feature | Implementation |
|---------|-----------------|
| **OOP Principles** | Encapsulation (private fields), modular classes, List collections |
| **Login System** | 3-attempt limit with account lockout |
| **Password Security** | `System.console().readPassword()` for hidden input |
| **Car Management** | Add vehicles, view fleet, check availability |
| **Transactions** | Automatic logging of all rental transactions |

## Default Credentials

```
Username: admin
Password: 1234
```

## Submission Checklist

- [ ] Upload all `.java` files to GitHub repository
- [ ] Screenshot of failed login attempt
- [ ] Screenshot of successful login
- [ ] Screenshot of car rental menu and transaction
- [ ] Include GitHub repository link in submission

---

**Last Updated:** February 6, 2026