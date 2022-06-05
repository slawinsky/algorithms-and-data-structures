package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-5, 10, 2, 15, 25, 3, 0, 8};
        System.out.println("Nieposortowana tablica:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        insertionSort(arr, arr.length);
        System.out.println();
        System.out.println("Posortowana tablica:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static int[] insertionSort(int[] arr, int len) {
        for(int next = 1; next < len; next++) {
            int curr = next;
            int tmp = arr[next];
            while((curr > 0) && (tmp < arr[curr - 1])) {
                arr[curr] = arr[curr - 1];
                curr--;
            }
            arr[curr] = tmp;
        }
        return arr;
    }
}
