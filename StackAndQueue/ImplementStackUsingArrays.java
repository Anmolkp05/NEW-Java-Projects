package StackAndQueue;

//Here overall the TC is = O(1)
//SC = 0(100)  since it depends on the array size bcz we doesnot know how much size we need and we have declare the array as 100 so the sc is O(100)


public class ImplementStackUsingArrays {
    public static void main(String[] args) {

        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println(s.top());  // last element as Stack is LIFO
        System.out.println(s.size()); // size of stack
        System.out.println(s.pop());  // to remove the last element as we know it is LIFO
        System.out.println(s.size());// size after removing the elements
        System.out.println(s.top()); // the last element after removing and modifying all them
    }
}
    class stack {
        int size = 100;
        int[] arr = new int[size];
        int top = -1;

        void push(int x) {                  //TC = O(1)
            if (top < arr.length - 1) {
                top++;
                arr[top] = x;
            } else {
                System.out.println("Stack Overflow");
            }
        }
        int pop() {                             //TC = O(1)
            if (top == -1) {
                return -1;
            } else {
                return arr[top--];
            }
        }
        int top() {                              //TC = O(1)
            return arr[top];
        }
        int size() {                            //TC = O(1)
            return top + 1;
        }
    }


