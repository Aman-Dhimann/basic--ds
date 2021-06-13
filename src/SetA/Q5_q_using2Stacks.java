package SetA;

import java.util.Scanner;
import java.util.Stack;

public class Q5_q_using2Stacks {
    static Stack<Integer> queue;
    Q5_q_using2Stacks(){
        queue = new Stack<>();
    }
     void enqueue(int data){
        //no overflow check
        queue.push(data);
        System.out.println(data + " is enqueued");
    }
     int dequeue(){
        if(queue.isEmpty()){
            System.out.println("queue is empty");
            return 0;
        }
        else{
            Stack<Integer> compli = new Stack<>();
            int del = 0;
            while (!queue.isEmpty()){
                int pop = queue.pop();
                compli.push(pop);
            }
            if(!compli.isEmpty()){
                del = compli.peek();
                compli.pop();
            }
            while (!compli.isEmpty()){
                int pop = compli.pop();
                queue.push(pop);
            }
            System.out.println(del + "is dequeued");
            return del;
        }
    }
    void display(){
        System.out.println("Below are the queue itmes ->");
        System.out.println(queue);
    }

    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Q5_q_using2Stacks q = new Q5_q_using2Stacks();
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            int data = s.nextInt();
            q.enqueue(data);
        }
        q.display();
        System.out.println();
        q.dequeue();
        q.dequeue();
        System.out.println();
        q.display();
    }
}
