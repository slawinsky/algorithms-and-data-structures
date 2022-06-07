package data.structures;

public class Main {
    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.insert(linkedList, 5);
//        linkedList.insert(linkedList, 4);
//        linkedList.insert(linkedList, 3);
//        linkedList.insert(linkedList, 2);
////        TODO

        /*
        Stack stack = new Stack();
        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.top();
        stack.pop();
        */

        Queue queue = new Queue();
        queue.inject(11);
        queue.inject(1);
        queue.inject(5);
        queue.inject(24);
        queue.inject(3);
        queue.out();
        queue.out();
        queue.out();
        queue.front();
    }
}
