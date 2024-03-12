package tests;
import org.junit.Test;
import static org.junit.Assert.*;
import lab4.IStack;
import lab4.GenericStack;

public class TestIStack {

    @Test
    public void testPush_1() {
        IStack<Integer> stack = new GenericStack<>(3);
        stack.push(1);
        String observed = stack.toString();
        String expected = "stack: [1]";
        assertEquals(expected, observed);
    }

    @Test
    public void testPush_1_2_3() {
        IStack<Integer> stack = new GenericStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        String observed = stack.toString();
        String expected = "stack: [1, 2, 3]";
        assertEquals(expected, observed);
    }
    @Test
    public void testPush_1_2_3_4() {
        IStack<Integer> stack = new GenericStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        String observed = stack.toString();
        String expected = "stack: [2, 3, 4]";
        assertEquals(expected, observed);
    }

    @Test
    public void testPeek_fullStack_Output4() {
        IStack<Integer> stack = new GenericStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        String observed = stack.toString();
        String expected = "stack: [2, 3, 4]";
        assertEquals(expected, observed);
        Integer observedItem = stack.peek();
        Integer expectedItem = 4;
        assertEquals(expectedItem, observedItem);
    }

    @Test
    public void testPop_return_removal() {
        IStack<Integer> stack = new GenericStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Integer observedItem = stack.pop();
        String observed = stack.toString();
        String expected = "stack: [2, 3]";
        assertEquals(expected, observed);
        Integer expectedItem = 4;
        assertEquals(expectedItem, observedItem);
    }

    @Test
    public void testGetSize_forEachPush() {

        IStack<Integer> stack = new GenericStack<>(3);
        stack.push(1);
        Integer expectedItem = 1;
        Integer observedItem = stack.getSize();
        assertEquals(expectedItem, observedItem);
        stack.push(2);
        expectedItem = 2;
        observedItem = stack.getSize();
        assertEquals(expectedItem, observedItem);
        stack.push(3);
        expectedItem = 3;
        observedItem = stack.getSize();
        assertEquals(expectedItem, observedItem);
        stack.push(4);
        observedItem = stack.getSize();
        expectedItem = 3;
        assertEquals(expectedItem, observedItem);
    }
}
