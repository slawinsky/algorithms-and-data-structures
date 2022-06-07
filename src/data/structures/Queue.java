package data.structures;

public class Queue {
    int[] arr = new int[10];
    int index = -1; //last added element index;

    public void inject(int addNum) {
        if(index < 9) arr[index + 1] = addNum;
        index++;
        System.out.print("Dodano " + addNum + " do kolejki, stan jest następujący: ");
        for(int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public void out() {
        int outNum = arr[index];
        arr[index] = 0;
        index--;
        System.out.print("Wyjęto " + outNum + " z kolejki, stan jest następujący: ");
        for(int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public void front() {
        System.out.println(arr[index] + " jest na początku kolejki");
    }
}
