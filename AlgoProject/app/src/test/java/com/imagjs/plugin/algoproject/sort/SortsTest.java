package com.imagjs.plugin.algoproject.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortsTest {

    @Test
    public void bubbleSort() {
        int[] array = {3, 2, 6, 4, 7, 9};
        Sorts.bubbleSort(array);
        for (int a : array) {
            System.out.println(a);
        }
    }

    @Test
    public void insertSort() {
        int[] array = {3, 2, 6, 4, 7, 9};
        Sorts.insertSort(array);
        for (int a : array) {
            System.out.print(a);
        }
    }

    @Test
    public void selectSort() {
        int[] array = {3, 2, 6, 4, 7, 9};
        Sorts.selectSort(array);
        for (int a : array) {
            System.out.println(a);
        }
    }
}