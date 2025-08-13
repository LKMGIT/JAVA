package August.day15.datastructure;

import java.util.ArrayList;

public class MyStack <T>{
    ArrayList<T> stack = new ArrayList<>();

    public void push(T item){
        stack.add(item);
    }

    public T pop(){
        if(isEmpthy())
            return null;
        return stack.removeLast();
    }

    public boolean isEmpthy(){
        return stack.isEmpty();
    }

    public T peek(){
        if(isEmpthy())
            return null;
        return stack.getLast();
    }

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.peek());

        System.out.println(myStack.pop());

        System.out.println(myStack.peek());

        System.out.println(myStack.pop());


    }

}
