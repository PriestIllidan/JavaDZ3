//Реализовать алгоритм сортировки слиянием


public class task1 {
    public static void main(String[] args) {
        int[] array = {11, 6, 45, 1, 7, 9, 2};
        mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");            
        }
    }

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = new int[array.length / 2];
            int[] right = new int[array.length - left.length];
            System.arraycopy(array, 0, left, 0, left.length);
            System.arraycopy(array, left.length, right, 0, right.length);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }



}