package br.com.sauerbronn.example.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for SimpleStack.
 */

class SimpleStackTest {

    @Test
    void testPushAndPeek() {
        SimpleStack stack = new SimpleStack(5);
        stack.push("A");
        assertEquals("A", stack.peek(), "The top element should be 'A'");
    }

    @Test
    void testPushAndPop() {
        SimpleStack stack = new SimpleStack(5);
        stack.push("A");
        assertEquals("A", stack.pop(), "The popped element should be 'A'");
    }

    @Test
    void testIsEmpty() {
        SimpleStack stack = new SimpleStack(5);
        assertTrue(stack.isEmpty(), "The stack should be empty initially");
        stack.push("A");
        assertFalse(stack.isEmpty(), "The stack should not be empty after pushing an element");
    }

    @Test
    void testSize() {
        SimpleStack stack = new SimpleStack(5);
        assertEquals(0, stack.size(), "The stack size should be 0 initially");
        stack.push("A");
        stack.push("B");
        assertEquals(2, stack.size(), "The stack size should be 2 after pushing two elements");
    }

    @Test
    void testStackOverflow() {
        SimpleStack stack = new SimpleStack(2);
        stack.push("A");
        stack.push("B");
        assertThrows(StackOverflowError.class, () -> stack.push("C"), "Pushing to a full stack should throw StackOverflowError");
    }

    @Test
    void testPopEmptyStack() {
        SimpleStack stack = new SimpleStack(5);
        assertThrows(IllegalStateException.class, stack::pop, "Popping from an empty stack should throw IllegalStateException");
    }

    @Test
    void testPeekEmptyStack() {
        SimpleStack stack = new SimpleStack(5);
        assertThrows(IllegalStateException.class, stack::peek, "Peeking into an empty stack should throw IllegalStateException");
    }
}
