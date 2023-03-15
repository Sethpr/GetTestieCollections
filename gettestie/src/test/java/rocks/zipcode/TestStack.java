package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    void testStack2() {
        Stack<String> stack = new Stack<>();
        String expected = "Hello world";
        stack.push(expected);


        stack.push("Goodbye");
        stack.pop();

        assertEquals(expected, stack.peek());
    }

    // Make a bigger test exercising more Stack methods.....
}
