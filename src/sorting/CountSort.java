package sorting;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 100, 8, 5, 4, 3 ,5 , 6};
        System.out.println("Nieposortowana tablica:");
        for(int num : arr) System.out.print(num + " ");
        System.out.println("\nPosortowana tablica:");
        int[] sortedArr = countSort(arr, arr.length);
        for(int num : sortedArr) System.out.print(num + " ");
    }

    private static int[] countSort(int[] arr, int len) {
        int max = maxValue(arr, len);
        int l1 = max + 1;
        int[] counts = new int[l1];
        int[] result = new int[len];
        for(int i = 0; i < l1; i++) counts[i] = 0;
        for(int i = 0; i < len; i++) counts[arr[i]]++;
        for(int i = 1; i < l1; i++) counts[i] += counts[i - 1];
        for(int i = len - 1; i >= 0; i--) result[--counts[arr[i]]] = arr[i];
        return result;
    }

    private static int maxValue(int[] arr, int len) {
        int max = -1;
        if(len <= 1) return arr[0];
        for(int i = 0; i < len; i++) {
            if(i == 0) max = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
