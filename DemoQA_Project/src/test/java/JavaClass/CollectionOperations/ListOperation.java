package JavaClass.CollectionOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListOperation {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(6);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println(list);

        List<Integer> list1 = new ArrayList();
        list1.add(8);
        list1.add(0);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        System.out.println(list1);

        list.addAll(list1);
        System.out.println(list);
       // list.clear();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.contains(8);

        Stack<Integer> stack = new Stack();
        stack.push(8);
        stack.push(0);
        stack.push(7);
        stack.push(10);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(9);
        System.out.println(stack);

    }
}
