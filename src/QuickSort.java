import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{5, 13, 0, -10, 40, 55, 14};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] array, int start, int end) {
        int middle = start + (end - start) / 2;
        int pivot = array[middle];
        int i = start, j = end;
        while (i <= j) {
            while (array[j] > pivot) {
                j--;
            }
            while (array[i] < pivot) {
                i++;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (i < end) {
            quickSort(array, i, end);
        }
        if (j > start) {
            quickSort(array, start, j);
        }
    }
}
