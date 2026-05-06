# Enquiry Automation Framework

This repository contains an automated testing framework for the Enquiry module, built using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**. It utilizes the **Page Object Model (POM)** design pattern for easy maintenance and readability.

## 🛠️ Technology Stack
*   **Programming Language:** Java 8+
*   **Automation Tool:** Selenium WebDriver
*   **Testing Framework:** TestNG
*   **Build Tool:** Maven
*   **Design Pattern:** Page Object Model (POM)
*   **Data-Driven Testing:** Apache POI (via the `/Excel` directory)

## 📁 Project Structure
*   `src/main/java`: Contains the Page Objects (WebElements and Action methods).
*   `src/test/java`: Contains the TestNG test cases and execution logic.
*   `Excel/`: Contains test data used for Data-Driven Testing.
*   `Screenshort/`: (Generated dynamically at runtime) Stores screenshots of failed test cases.
*   `testng.xml`: The suite configuration file to execute tests in bulk.
*   `pom.xml`: Manages all project dependencies.

## 🚀 Prerequisites for Cloning
To run this project on your local machine, you will need:
1.  [Java JDK 8 or higher](https://adoptium.net/) installed and added to your system PATH.
2.  [Apache Maven](https://maven.apache.org/download.cgi) installed and added to your system PATH.
3.  An IDE like Eclipse or IntelliJ IDEA.

## 💻 Installation & Setup
1. Clone the repository to your local machine:
   
```bash
   git clone [https://github.com/YourUsername/Enquiry-Automation.git](https://github.com/YourUsername/Enquiry-Automation.git)