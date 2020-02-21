package com.tomascostax.euromilhoes;

public interface ITqsStack {
    void push(Object x);
    Object peek();
    Object pop();
    int size();
    boolean isEmpty();
}
