package com.heinika.algoproject.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSort() {
        int[] a = {4,2,9,5,6};
        QuickSort.quickSort(a,5);
        System.out.print(Arrays.toString(a));
    }
}