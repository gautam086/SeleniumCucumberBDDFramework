# 🚀 Selenium Cucumber BDD Automation Framework

## 📌 Overview

This project is a **scalable UI automation framework** built using:

* Selenium WebDriver
* Cucumber (BDD)
* TestNG
* Maven

It is designed with **industry best practices** and supports **CLI-driven execution**, making it fully **CI/CD ready**.

---

## 🧰 Tech Stack

* Java
* Selenium WebDriver
* Cucumber (BDD)
* TestNG
* Maven
* Extent Reports

---

## ⚙️ Key Features

* ✅ Page Object Model (POM) design pattern
* ✅ PicoContainer for Dependency Injection
* ✅ Parallel execution using TestNG
* ✅ Extent Reports with screenshot capture on failure
* ✅ Tag-based execution via CLI
* ✅ Feature-based execution via CLI
* ✅ Browser switching via CLI
* ✅ Environment switching (dev / qa / prod)
* ✅ CI-ready framework design

---

## 📂 Project Structure

```
src/test/java
│
├── runner              # TestNG runner
├── stepdefinitions     # Step definitions
├── pageobjects         # Page Object classes
├── hooks               # Hooks (Before/After)
├── utils               # Utilities (DriverManager, TestBase, etc.)
└── context             # Test context setup

src/test/resources
│
├── Features            # Feature files
├── config-dev.properties
├── config-qa.properties
├── config-prod.properties
```

---

## ▶️ How to Run Tests

### 🔹 Run all tests

```
mvn test
```

---

### 🔹 Run by tag

```
mvn test "-Dcucumber.filter.tags=@RunFirst"
```

---

### 🔹 Run specific feature

```
mvn test "-Dcucumber.features=src/test/resources/Features/Registration.feature"
```

---

### 🔹 Run with browser

```
mvn test -Dbrowser=chrome
```

---

### 🔹 Run with environment

```
mvn test -Denv=qa
```

---

### 🔹 Combined execution

```
mvn test -Denv=qa -Dbrowser=chrome "-Dcucumber.filter.tags=@RunFirst"
```

---

## 📊 Reports

After execution, Extent report is generated at:

```
test-output/ExtentReport/SparkReport/Spark.html
```

---

## 🔁 Rerun Failed Tests

```
mvn test "-Dcucumber.features=@target/failed.txt"
```

---

## 🚀 CI/CD Ready

The framework is designed to integrate with CI tools like:

* GitHub Actions
* Jenkins

Supports dynamic execution using:

* Environment
* Browser
* Tags
* Feature files

---

## 🧠 Design Highlights

* Centralized driver management using ThreadLocal
* Dependency Injection using PicoContainer
* Separation of concerns using Page Object Model
* Externalized configuration for environment control
* CLI-driven execution for flexibility

---

## 🚀 Future Enhancements

* Allure reporting with trend history
* Retry mechanism for flaky tests
* Docker-based execution
* Cross-browser execution in parallel
* Integration with cloud grids (Selenium Grid / BrowserStack)

---

## 👨‍💻 Author

Automation framework built as part of SDET engineering practice.
