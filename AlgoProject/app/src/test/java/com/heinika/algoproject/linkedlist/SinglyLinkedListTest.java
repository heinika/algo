package com.heinika.algoproject.linkedlist;

import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {
    public com.imagjs.plugin.algoproject.linkedlist.SinglyLinkedList singlyLinkedList;

    @Before
    public void setup() {
        singlyLinkedList = new com.imagjs.plugin.algoproject.linkedlist.SinglyLinkedList();
        singlyLinkedList.insertToHead(7);
        singlyLinkedList.insertToHead(190);
    }

    @Test
    public void findByValue() {
        assert singlyLinkedList.findByValue(7) == singlyLinkedList.findByIndex(0);
    }

    @Test
    public void findByIndex() {
        assert singlyLinkedList.findByValue(7) == singlyLinkedList.findByIndex(0);
    }

    @Test
    public void insertToHead() {
        singlyLinkedList.insertToHead(6);
        assert singlyLinkedList.findByIndex(0).getData() == 6;
    }

    @Test
    public void insertAfter() {
        singlyLinkedList.insertAfter(singlyLinkedList.findByIndex(1),9);
        assert singlyLinkedList.findByIndex(3).getData() == 9;
    }

    @Test
    public void insertBefore() {
        singlyLinkedList.insertBefore(singlyLinkedList.findByIndex(1),9);
        assert singlyLinkedList.findByIndex(1).getData() == 9;
    }

    @Test
    public void deleteByValue() {
        singlyLinkedList.deleteByValue(singlyLinkedList.findByIndex(0).getData());
        assert singlyLinkedList.findByIndex(0).getData() == 7;
    }

    @Test
    public void deleteByNode() {
        singlyLinkedList.deleteByNode(singlyLinkedList.findByIndex(0));
        assert singlyLinkedList.findByIndex(0).getData() == 7;
    }

    @Test
    public void printAll() {
        singlyLinkedList.printAll();
    }
}