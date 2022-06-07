package data.structures;

public class Stack {
    int[] arr = new int[10];
    int top;

    public Stack() {

    }

    public void push(int addNum) {
        int[] temp = new int[10];
        temp[0] = addNum;
        for(int i = 1; i < arr.length - 1; i++) {
            temp[i] = arr[i - 1];
        }
        arr = temp;
        top = addNum;
        System.out.print("Dodano " + addNum + " do stosu, stan jest następujący: ");
        for(int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public void pop() {
        int popNum = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(i != 9) arr[i] = arr[i + 1];
        }
        System.out.print("Wyjęto " + popNum + " ze stosu, stan jest następujący: ");
        for(int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public void top() {
        System.out.println(top + " jest na początku stosu");
    }
}
