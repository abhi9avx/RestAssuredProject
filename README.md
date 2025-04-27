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
│           └── FirstTest.java  # Sample REST API test
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

3. **Hamcrest (v2.2)**
   - Library of matcher objects for test assertions
   - Used for creating flexible test assertions

## Prerequisites

- Java JDK 17 or higher
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
mvn test -Dtest=FirstTest
```

### Run specific test method
```bash
mvn test -Dtest=FirstTest#testFirst
```

## Test Details

### FirstTest.java
This test class demonstrates a basic REST API test:
- Makes a GET request to `https://reqres.in/api/users/2`
- Verifies the response status code is 200
- Uses TestNG annotations for test execution

## Project Configuration

The project is configured with:
- Java 17 as the target version
- Maven as the build tool
- TestNG as the test runner
- REST Assured for API testing

## Additional Notes

- The project uses reqres.in as a sample API for testing
- All tests are in the `src/test/java` directory
- Test reports are generated in the `target/surefire-reports` directory after test execution

## Troubleshooting

If you encounter any issues:

1. Ensure Java 17 is installed and JAVA_HOME is set correctly
2. Verify Maven is installed and accessible from command line
3. Check internet connection for dependency downloads
4. Clear Maven cache if dependency issues persist:
   ```bash
   mvn clean
   rm -rf ~/.m2/repository/com/abhinav/restassured
   mvn install
   ``` 