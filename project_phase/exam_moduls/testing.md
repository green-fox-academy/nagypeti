## :books: Exam requirements on testing: :rotating_light:

**What are software tests? </br>**
A software test is a piece of software, which executes another piece of software. :) It validates if that code results in the expected state (state testing) or executes the expected sequence of events (behavior testing).

**Why are software tests helpful? </br>**
Software unit tests help the developer to verify that the logic of a piece of the program is correct.
Running tests automatically helps to identify software regressions introduced by changes in the source code. Having a high test coverage of your code allows you to continue developing features without having to perform lots of manual tests.

**Three main type of testing techniques:**
- Unit Testing
- Integration Testing
- End-To-End Testing

Keep in mind that they don't replace each other. They are all important.

### 1. Model, unit

A unit test is a piece of code written by a developer that executes a specific functionality in the code to be tested and asserts a certain behavior or state.

The percentage of code which is tested by unit tests is typically called test coverage.

A unit test targets a small unit of code, e.g., a method or a class. External dependencies should be removed from unit tests, e.g., by replacing the dependency with a test implementation or a (mock) object created by a test framework.

Unit tests are not suitable for testing complex user interface or component interaction. For this, you should develop integration tests.

**Basic example in Java:**

Method to be tested:
```Java
public final class Math {
    public static int add(int first, int second) {
        return firstNumber + secondNumber;
    }
}
```
Writing unit test:
```Java
public class MathTests {
  @Test
  public void add_TwoPlusTwo_ReturnsFour() {
      final int expected = 4;
      final int actual = Math.add(2, 2);
      Assert.assertEquals(actual, expected);
  }
}
```

### 2. Integration, endpoint

An integration test aims to test the behavior of a component or the integration between a set of components. The term functional test is sometimes used as synonym for integration test. Integration tests check that the whole system works as intended, therefore they are reducing the need for intensive manual tests.

These kinds of tests allow you to translate your user stories into a test suite. The test would resemble an expected user interaction with the application.

When testing a REST resource, there are usually a few responsibilities the tests should focus on:

- the HTTP response code
- other HTTP headers in the response
- the payload (JSON, XML)

Show some endpoint test if asked.

### 3. End to end

End-to-end testing is a methodology used to test whether the flow of an application is performing as designed from start to finish. The purpose of carrying out end-to-end tests is to identify system dependencies and to ensure that the right information is passed between various system components and systems.

It involves ensuring that the integrated components of an application function as expected. The entire application is tested in a real-world scenario such as communicating with the database, network, hardware and other applications.

### 4. Mocking (mock, stub, spy)


Mocking in SpringBoot:

- We can mock the service, and we can create http requests without starting a server using mockMvc
- MockBean is used to mock a layer that is needed to use to test another layer. Here we want to test the controller (endpoint test), but we don't want to test the greet() method from the service layer


```Java
@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
public class WebMockTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private GreetingService service;

  @Test
  public void greetingShouldReturnMessageFromService() throws Exception {
    when(service.greet()).thenReturn("Hello Mock");
    this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello Mock")));
  }
}
```

### 5. Assertions

With JUnit:

JUnit provides static methods to test for certain conditions via the Assert class. These assert statements typically start with assert. They allow you to specify the error message, the expected and the actual result. An assertion method compares the actual value returned by a test to the expected value. It throws an AssertionException if the comparison fails.


### Expected skills (4/5)

#### Able to explain the reason for testing

1. Software testing is really required to point out the defects and errors that were made during the development phases.
2. It’s essential since it makes sure that the customer finds the organization reliable and their satisfaction in the application is maintained.
3. Testing is required for an effective performance of software application or product.
4. It’s important to ensure that the application should not result into any failures because it can be very expensive in the future or in the later stages of the development.
  - Proper testing ensures that bugs and issues are detected early in the life cycle of the product or application
  - If defects related to requirements or design are detected late in the life cyle, it can be very expensive to fix them since this might require redesign, re-implementation and retesting of the application.
5. It’s required to stay in the business.
  - Users are not inclined to use software that has bugs. They may not adopt a software if they are not happy with the stability of the application.

#### Able to explain the difference between unit and integration tests

See explanation above under 1. and 2. points :arrow_up:

#### Able to create different test scenarios / test cases

We have to write more test cases / scenarios to make sure we cover all the possibilities (test for more input parameters and for more results).

#### Able to explain the need for mocking

#### Able to show different types of assertions

Show some assertions from the project ;)
