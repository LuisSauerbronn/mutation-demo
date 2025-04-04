# Mutation Demo

This repository contains example source code for a presentation on **Mutation Testing**. The project demonstrates how mutation testing can be applied to evaluate the quality of unit tests by introducing small changes (mutations) to the code and checking if the tests can detect them.

## What is Mutation Testing?

Mutation testing is a technique used to measure the effectiveness of test cases. It works by:
1. Introducing small changes (mutations) to the source code.
2. Running the test suite to see if the tests fail.
3. Identifying areas where the tests are insufficient if the mutations are not detected.

## Project Structure

- **`src/`**: Contains the source code for the demo.
- **`test/`**: Includes unit tests for the source code.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Maven an the build tool.
- A mutation testing tool like [PIT](https://pitest.org/).
- A code coverage report library like [Jacoco](https://www.eclemma.org/jacoco/)

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/mutation-demo.git
    cd mutation-demo
    ```

2. Generate the report and verify code coverage:
    ```bash
    mvn verify
    ```

3. Add the PIT configuration to the build plugins section of the [POM](pom.xml)
    ```xml

      <plugin>
        <groupId>org.pitest</groupId>
        <artifactId>pitest-maven</artifactId>
        <version>1.19.0</version>
        <dependencies>
          <dependency>
            <groupId>org.pitest</groupId>
            <artifactId>pitest-junit5-plugin</artifactId>
            <version>1.2.2</version>
          </dependency>
        </dependencies>
        <configuration>
        <targetClasses>
          <param>com.zuhlke.example.stack.*</param>
        </targetClasses>
        </configuration>
      </plugin>
    ```

4. Run mutation tests:
    ```bash
    mvn test-compile org.pitest:pitest-maven:mutationCoverage
    ```

## Resources

- [PIT Mutation Testing](https://pitest.org/)
- [Mutation Testing Concepts](https://en.wikipedia.org/wiki/Mutation_testing)

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---
Feel free to explore and modify the code to better understand mutation testing!