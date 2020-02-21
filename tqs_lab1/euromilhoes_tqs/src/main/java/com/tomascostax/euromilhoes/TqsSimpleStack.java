package com.tomascostax.euromilhoes;
import java.util.*;

public class TqsSimpleStack implements ITqsStack{
    //
    Deque<Object> stack = new ArrayDeque<Object>();

    @Override
    public void push(Object x) {
        return;
    }

    @Override
    public Object pop(){
        return null;
    }

    @Override
    public Object peek(){
        return null;
    }

    @Override
    public int size(){
        return 0;
    }

    @Override
    public boolean isEmpty(){
        return true;
    }

}
