package com.structural.bridge;

public interface LinkedList<T> {

    void addFirst(T element);
    void addLast(T element);
    T removeFirst();
    T removeLast();
}
