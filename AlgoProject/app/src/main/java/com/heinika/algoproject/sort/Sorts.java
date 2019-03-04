package com.heinika.algoproject.sort;

public class Sorts {
    // bubble sort
    public static int[] bubbleSort(int[] a) {
        if (a.length <= 1)
            return a;
        for (int i = 0; i < a.length - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] >= a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSwap = true;
                }
                if (!isSwap)
                    break;
            }
        }
        return a;
    }

    // insert sort
    public static int[] insertSort(int[] a) {
        if (a.length <= 1)
            return a;
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
        return a;
    }

    // select sort
    public static int[] selectSort(int[] a) {
        if (a.length <= 1)
            return a;
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }

        }
        return a;
    }
}