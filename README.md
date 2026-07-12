# SauceDemo QA Automation Assignment

## Overview

This project contains automated UI tests for the SauceDemo application using Selenium WebDriver, Java, TestNG, and Maven. 

LoginFlow.java file automates the SauceDemo login functionality by testing both positive and negative scenarios including successful login with valid credentials, login attempts with invalid credentials, validation for empty input fields, and logout functionality to ensure users are redirected back to the login page.

E2EPurchaseFlow.java automates the complete purchase process from login to order confirmation. It includes logging in, adding two products to the cart, verifying the cart badge count, completing the checkout process by entering customer information, validating the order summary, and confirming that the order is successfully placed with the expected confirmation message.

## Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* REST Assured (Bonus API Testing)

## Prerequisites

* Java JDK 17 or later
* IntelliJ IDEA
* Google Chrome
* Maven (for dependency management)

## Installation

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Maven will automatically download all required dependencies from the `pom.xml` file.

## Running the Tests

Open the desired test class (for example, `LoginFlow.java` or `E2EPurchaseFlow.java`) and click the **Run** button in IntelliJ IDEA to execute the tests.

## Project Structure

```text
src
├── main
│   └── java
├── test
│   └── java
│       ├── LoginFlow.java
│       ├── E2EPurchaseFlow.java
│       └── APITests.java
```

## Framework Design

This project uses Selenium WebDriver with TestNG for UI automation. Tests are organized into separate classes based on functionality. REST Assured is used for the optional API testing task.
