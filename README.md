# REST Assured Learning Project

This project demonstrates the usage of REST Assured for API testing using Java and TestNG framework.

## Project Structure

```
restassuredlearning/
├── pom.xml                 # Maven configuration file
├── src/
│   ├── main/
│   │   └── java/          # Main source code
│   └── test/
│       └── java/          # Test source code
│           ├── base/      # Base test configuration
│           │   └── BaseTest.java  # Base test class with common setup
│           └── testingAPIs/       # API test classes
│               └── GetUserTest.java  # User  API test
├── .vscode/               # VS Code configuration
└── target/                # Compiled files and test reports
```

## Dependencies

The project uses the following main dependencies:

1. **REST Assured (v5.3.0)**
   - Used for making HTTP requests and testing REST APIs
   - Provides a domain-specific language (DSL) for testing REST services

2. **TestNG (v7.7.1)**
   - Testing framework for Java
   - Provides annotations for test methods
   - Offers better test organization and reporting

3. **JSON Path (v5.3.0)**
   - Used for parsing and validating JSON responses
   - Provides powerful JSON querying capabilities

## Prerequisites

- Java JDK 11 or higher
- Maven 3.6 or higher
- Internet connection (for downloading dependencies)

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd restassuredlearning
   ```

2. Install dependencies:
   ```bash
   mvn clean install
   ```

## Running Tests

### Run all tests
```bash
mvn test
```

### Run specific test class
```bash
mvn test -Dtest=PostUserTest
```

### Run specific test method
```bash
mvn test -Dtest=PostUserTest#createUser
```

## Test Details

### BaseTest.java
- Base class for all test classes
- Configures the base URI for API requests
- Sets up common test configurations

### PostUserTest.java
This test class demonstrates:
- User authentication with the API
- Creating a new user
- Verifying response status code and body
- Using TestNG annotations for test execution

## Project Configuration

The project is configured with:
- Java 11 as the target version
- Maven as the build tool
- TestNG as the test runner
- REST Assured for API testing
- Surefire plugin (v3.0.0) for test execution

## Additional Notes

- The project uses reqres.in as a sample API for testing
- All tests are organized in the `src/test/java` directory
- Test reports are generated in the `target/surefire-reports` directory after test execution
- Base test configuration is centralized in the `base` package

## Troubleshooting

If you encounter any issues:

1. Ensure Java 11 is installed and JAVA_HOME is set correctly
2. Verify Maven is installed and accessible from command line
3. Check internet connection for dependency downloads
4. Clear Maven cache if dependency issues persist:
   ```bash
   mvn clean
   rm -rf ~/.m2/repository/com/restassured
   mvn install
   ``` 
