package searching;

public class HoareAlgorithm {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 0, 3, 8, 10, 12};
        System.out.println(hoare(arr, arr.length, 4));
    }

    public static int hoare(int arr[], int len, int key) {
        int i = 0;
        int j = len - 1;
        while(i != j) {
            int p = partition(arr, i, j);
            p = p - i + 1;
            if(p >= key) j = i + p - 1;
            if(p < key) {
                key -= p;
                i += p;
            }
        }
        return i;
    }

    public static int partition(int arr[], int l, int r) {
        int k, tmp;
        k = arr[l];
        while(l < r) {
            while((l < r) && (arr[r] >= k)) r--;
            while((l < r) && (arr[l] < k)) l++;
            if(l < r) {
                tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;
            }
        }
        return l;
    }
}
