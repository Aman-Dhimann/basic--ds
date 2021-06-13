package SetA;

import java.util.Scanner;
import java.util.Stack;

public class Q4_reverse {
    static Q1_setA q;
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the size");
        int size = s.nextInt();
        System.out.println("enter the m");
        int m = s.nextInt();
        System.out.println("enter the data one by one");
        q = new Q1_setA(size);
        for (int i = 0; i < size; i++) {
            int data = s.nextInt();
            q.enqueue(data);
        }
        System.out.println();
        q.display();
        System.out.println();
        reverse(m,size);

    }
    static void reverse(int m,int size){
        if(m>=size){
            System.out.println("sorry");
        }
        else{
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < m; i++) {
                int del = q.dequeue();
                stack.push(del);
            }
            for (int i = 0; i < m; i++) {
                int pop = stack.pop();
                q.enqueue(pop);
            }
            for (int i = 0; i < size-m; i++) {
                int del = q.dequeue();
                q.enqueue(del);
            }
            q.display();
        }
    }
}
