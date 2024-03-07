class Testing {
    /*
     * Failure is any deviation of the observed behavior from the specified behavior
     * Erroneous state - the system is in a state such that further processing willl
     * result in failure (it hasnt crashed yet but it will)
     * Fault is the mechanical or algorithmic cause of the erroneous state
     * a fault causes erroneous state which causes failure
     * 
     * Test component - a part of the system that is isolated for testing
     * 
     * Testing is a systematic attempt to find bugs in a controlled environment
     * 
     * We cannot demonstrate that faults aren't present, no code is perfect to a tee
     * A successful test shows up a failure, telling us that bugs exist but may not
     * tell us where the bugs exist
     * 
     * Similar to falsification in scientific theory where you make a theory and try
     * to break it
     * 
     * what does a successful test show? it shows that bugs exist and the code isn't
     * perfect
     * 
     * Program testing can be used to show the presence of bugs but never to show
     * their absence
     * A successful test shows a failure
     * 
     * Test cases contain:
     * A set of inputs which include the state of my object
     * Expected results given those inputs
     * We use them to detect the existence of faults by causing failures
     * A test case does not directly give us the fault, it just shows the failure,
     * we have to find the fault ourselves
     * 
     * The best practice is to test at the lowest level possible, individual units
     * or components of software
     * Unit testing *YIPPEE*
     * 
     * A test plan is the set of test cases for a specific unit (method/class)
     * 
     * To make testing most likely to succeed, the best practices include
     * test boundaries/corner/edge cases: smallest, largest, special values based on
     * the contract
     * Test routine cases, common, expected inputs
     * test challenging cases
     * Don't need to test for things that are destined to fail (ex. dividing by
     * zero or non precondition)
     * 
     * 
     * Blackbox vs Whitebox testing
     * 
     * Blackbox focuses on the input behavior and uses contracts to create test
     * plans - treat the code like a blackbox
     * blackbox pros: one test plan works for any implementation, if implementation
     * changes, our test cases will automatically change with it
     * blackbox cons: cant guarantee 100% code coverage, we dont look at
     * implementation so
     * who knows if we missed something
     * 
     * Whitebox focuses on internal structure of the component, every state of the
     * object and its interactions are tested. Every possible code path is tested,
     * 100% line coverage, look at code while developing test cases
     * whitebox pros: we get close to 100% code coverage, is easier to develop by
     * looking at implementation
     * whitebox cons: we can miss errors of omission (cant write tests for
     * requirements that are forgotten). cant develop code before its written. when
     * code changes, tests have to change too, new implementation = new testing
     * 
     * Tracing & Debugging
     * Objective: locate errors using test inputs
     * Approach: analyze the code on sample test inputs to understand why code fails
     * to behave as expected
     * Tracing: analyze but dont execute code
     * Debugging: execute code on selected input and breakpoints
     * Like rubber ducking
     * 
     * Test driven development: write the tests before you write any code. Write the
     * code with the intent to pass the tests
     * TDD is blackbox
     * 
     * The assert is true when the test case is executed and run to completion
     * The assert is false when the test case fails because the boolean expression
     * returned false, halting the test execution
     * 
     */

}