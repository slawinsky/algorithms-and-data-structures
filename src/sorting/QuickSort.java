package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, -20, 8, 5, 4, 3 ,5 , 6};
        System.out.println("Nieposortowana tablica:");
        for(int num : arr) System.out.print(num + " ");
        System.out.println("\nPosortowana tablica:");
        quickSort(arr, 0, arr.length - 1);
        for(int num : arr) System.out.print(num + " ");
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l >= r) return;
        int k = partition(arr, l, r);
        quickSort(arr, l, k - 1);
        quickSort(arr, k + 1, r);
    }

    private static int partition(int[] arr, int l, int r) {
        int i = l + 1;
        int j = r;
        int p = arr[l]; //pivot
        int tmp;
        do {
            while ((i < r) && (arr[i] <= p)) i++;
            while ((j > i) && (arr[j] >= p)) j--;
            if (i < j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        } while (i < j);
        if (arr[i] > p) {
            arr[l] = arr[i - 1];
            arr[i - 1] = p;
            return i - 1;
        } else {
            arr[l] = arr[i];
            arr[i] = arr[p];
            return i;
        }
    }
}
