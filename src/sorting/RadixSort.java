package sorting;
//TODO
public class RadixSort {
    public static void main(String[] args) {

    }

    private void radixSort(int[] arr, int len) {
        int max = findMaxNum(arr, len);
        int numberOfDigits = calculateNumberOfDigitsIn(max);
        int placeValue = 1;
        while(numberOfDigits-- > 0) {
            applyCountingSortOn(arr, placeValue);
            placeValue *= 10;
        }
    }

    private void applyCountingSortOn(int[] arr, int placeValue) {
        int range = 10;
    }

    private static int calculateNumberOfDigitsIn(int num) {
        int length = (int)(Math.log10(num) + 1);
        return length;
    }

    private static int findMaxNum(int[] arr, int len) {
        int max = -1;
        for(int i = 0; i < len; i++) {
            if(i == 0 || arr[i] > max) max = arr[i];
        }
        return max;
    }
}
