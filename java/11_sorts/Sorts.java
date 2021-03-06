public class Sorts {
    // bubble sort
    public static int[] bubbleSort(int[] a) {
        if (a.length <= 1)
            return;
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
    }

    // insert sort
    public static int[] insertSort(int[] a) {
        if (a.length <= 1)
            return;
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = j - 1;
            for (; j >= 0; j--) {
                if (a[i] < value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j] = value;
        }
    }

    // select sort
    public static int[] selectSort(int a) {
        if (a.length <= 1)
            return;
        for (i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int minIndex = i;
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    min = a[j + 1];
                    minIndex = j + 1;
                }
            }
            if (minIndex == i)
                continue;
            if (a[i] > min) {
                int temp;
                a[i] = a[minIndex];
                a[j] = temp;
            }
        }
    }
}