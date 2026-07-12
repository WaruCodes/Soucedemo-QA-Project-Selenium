# SauceDemo QA Automation Assignment

## Overview

This project contains automated UI tests for the SauceDemo application using Selenium WebDriver, Java, TestNG, and Maven. 

LoginFlow.java file automates the SauceDemo login functionality by testing both positive and negative scenarios including successful login with valid credentials, login attempts with invalid credentials, validation for empty input fields, and logout functionality to ensure users are redirected back to the login page.

E2EPurchaseFlow.java automates the complete purchase process from login to order confirmation. It includes logging in, adding two products to the cart, verifying the cart badge count, completing the checkout process by entering customer information, validating the order summary, and confirming that the order is successfully placed with the expected confirmation message.

The project includes optional REST API tests implemented using REST Assured against the public JSONPlaceholder API. The tests cover GET, POST, and negative scenarios by retrieving a resource, creating a new resource, and validating the application's response to an invalid request through HTTP status code assertions.
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


## Note

Given more time, I would further enhance this assignment by:

- Refactoring the automation framework to use the **Page Object Model (POM)** for better maintainability and scalability.
- Introducing a **Driver Factory** class to improve WebDriver initialization and browser management.
- Expanding the test suite to include more **positive, negative, and edge-case scenarios**, particularly for the login functionality in Task 2.
- Separating test data from test logic to improve reusability and maintainability.
- Performing another complete review of the repository to further refine the code, documentation, and overall project structure before submission.

Although there are opportunities for further improvements, I focused on delivering a clean, functional solution that demonstrates my understanding of QA practices, test automation, and bug reporting within the given timeframe.