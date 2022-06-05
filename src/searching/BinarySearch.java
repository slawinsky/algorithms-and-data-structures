package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 12, 18, 25, 40};
        System.out.println(search(arr, arr.length, 10));
    }

    private static int search(int[] arr, int len, int key) {
        int l = 0;
        int r = len - 1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(arr[m] == key) {
                return m;
            } else {
                if(arr[m] < key) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}
