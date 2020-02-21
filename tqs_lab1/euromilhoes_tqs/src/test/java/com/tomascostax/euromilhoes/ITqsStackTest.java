package com.tomascostax.euromilhoes;
//import static java.time.Duration.ofMillis;
//import static java.time.Duration.ofMinutes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ITqsStackTest {
    private TqsSimpleStack stack;

    @BeforeEach
    public void reset_stack(){
        stack = new TqsSimpleStack();
    }

    @Test
    void empty_stack(){
        TqsSimpleStack new_stack = new TqsSimpleStack();
        Assertions.assertTrue(new_stack.isEmpty());
    }

    @Test
    void size_0_stack(){
        TqsSimpleStack new_stack = new TqsSimpleStack();
        Assertions.assertTrue(new_stack.size() == 0);
    }

    @Test
    void not_empty_stack(){
        stack.push("Objeto");
        stack.push(1);

        //We test the assertions and then reset the stack
        Assertions.assertFalse(stack.isEmpty());
        Assertions.assertTrue(stack.size() == 2);

    }

    @Test
    void push_then_pop(){
        Object s = "ola";
        stack.push(s);
        Object x = stack.pop();

        Assertions.assertEquals(s,x);
    }

    @Test
    void push_then_peek(){
        Object s = "ola";
        int size_before = stack.size();
        stack.push(s);
        Object x = stack.peek();

        int size_after = stack.size();
        Assertions.assertEquals(s,x);
        Assertions.assertEquals(size_before,size_after);

    }

}
