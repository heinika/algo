package com.imagjs.plugin.algoproject.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        int[] a = {4, 6, 5, 3, 9, 7, 16, 12};
        MergeSort.mergeSort(a, 8);
        System.out.print(Arrays.toString(a));
    }
}