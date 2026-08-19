package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        Mystack stack = new Mystack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // returns 2
        stack.pop();
        System.out.println(stack.pop());   // returns 1
        System.out.println(stack.empty());




    }

}
class Mystack{
    Queue<Integer> q;

    public Mystack() {
        q = new LinkedList<>();

    }

    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.poll());

        }

    }

    public int pop() {
        return q.poll();

    }

    public int top() {
        return q.peek();

    }

    public boolean empty() {
        return q.isEmpty();

    }

}
