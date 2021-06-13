package SetA;

import java.util.Scanner;

// Queue Implementation using array
public class Q1_setA {
    public  int front , rear;
    public static int[] array;
    public int capacity;
    public int num_of_even;

    Q1_setA(int c){
        front = rear = 0;
        capacity = c;
        array = new int[capacity];
        num_of_even = 0;
    }

    void enqueue(int data){
        if(rear == capacity){
            System.out.println("queue is full");
        }
        else{
            array[rear] = data;
            rear++;
            if(data%2==0){
                num_of_even++;
            }
        }
    }

    int peek(){
        if(front == rear){
            return 0;
        }
        else{
            return array[front];
        }
    }

    int dequeue(){
        if(front == rear){
            System.out.println("queue is full");
            return 0;
        }
        else{
            int del = array[0];
            for (int i = 0;i<rear-1;i++){
                array[i] = array[i+1];
            }
            rear--;

            return del;
        }
    }

    void display(){
        if(front == rear){
            System.out.println("queue is empty");
            return;
        }
        for(int i = 0;i<rear;i++){
            System.out.print(array[i]+" -> ");
        }
    }
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the size");
        int size = s.nextInt();
        Q1_setA q = new Q1_setA(size);
        System.out.println("enter the number of elements");
        int num = s.nextInt();
        System.out.println("enter the data one by one");
        for (int i = 0; i < num; i++) {
            int add = s.nextInt();
            q.enqueue(add);
        }
        q.display();
        System.out.println("dequeue elements :-");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.display();

    }
}
