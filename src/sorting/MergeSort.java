package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, -20, 8, 5, 4, 3 ,5 , 6};
        System.out.println("Nieposortowana tablica:");
        for(int num : arr) System.out.print(num + " ");
        System.out.println("\nPosortowana tablica:");
        mergeSort(arr, arr.length);
        for(int num : arr) System.out.print(num + " ");
    }

    private static int[] mergeSort(int[] arr, int len) {
        if(len <= 1) return arr;
        int m = len / 2;
        int[] l = new int[m];
        int[] r = new int[len - m];

        for(int i = 0; i < m; i++) {
            l[i] = arr[i];
        }
        for(int i = m; i < len;  i++) {
            r[i - m] = arr[i];
        }

        mergeSort(l, m);
        mergeSort(r, len - m);

        merge(arr, l, r, m, len - m);

        return arr;
    }

    private static int[] merge(int[] arr, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while(i < left && j < right) {
            if(l[i] <= r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        while(i < left) {
            arr[k++] = l[i++];
        }
        while(j < right) {
            arr[k++] = r[j++];
        }
        return arr;
    }
}
