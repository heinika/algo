package com.imagjs.plugin.algoproject.array;

import org.junit.Before;
import org.junit.Test;

public class ArrayTest {
    Array array;

    @Before
    public void init() {
        array = new Array(6);
        array.insertToTail(1);
        array.insertToTail(2);
        array.insertToTail(3);
        array.insertToTail(4);
        array.insertToTail(5);
    }

    @Test
    public void find() {
        assert array.find(1) == 2;
    }

    @Test
    public void delete() {
        array.delete(2);
        assert array.find(2) == 4;
    }

    @Test
    public void insert() {
        array.insert(0,99);
        assert array.find(0) == 99;
    }

    @Test
    public void insertToTail() {
        array.insertToTail(1);
        assert array.find(5) == 1;
    }

    @Test
    public void printAll() {
        array.printAll();
    }
}