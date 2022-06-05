package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-5, 10, 2, 15, 25, 3, 0, 8};
        System.out.println("Nieposortowana tablica:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        selectionSort(arr, arr.length);
        System.out.println();
        System.out.println("Posortowana tablica:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static int[] selectionSort(int[] arr, int len) {
        int i = 0;
        while(i < len) {
            int min = indexOfMin(arr, i, len);
            swap(arr, i, min);
            i++;
        }
        return arr;
    }

    private static int[] swap(int[] arr, int i, int min) {
        int tmp = arr[i];
        arr[i] = arr[min];
        arr[min] = tmp;
        return arr;
    }

    private static int indexOfMin(int[] arr, int i, int len) {
        int min = i;
        for(int j = i; j < len; j++) {
            if(arr[min] > arr[j]) min = j;
        }
        return min;
    }
}
