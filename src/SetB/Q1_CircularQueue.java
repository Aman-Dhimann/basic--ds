package SetB;

import java.util.Scanner;

public class Q1_CircularQueue {
    static int front,rear;
     int[] array;
    static int capacity;
    Q1_CircularQueue(int size){
        front = rear = -1;
        array = new int[size];
        capacity = size;
    }
    void enqueue(int data){
        //overflow condition
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
            if(front == -1 || front>=capacity-1){
                //queue is empty
                front = 0;
                array[front] = data;
                rear = 0;
                System.out.println(data +" is enqueues");
            }
            else{
                if(front==0 && rear ==0){
                    rear++;
                    array[rear] = data;
                    System.out.println(data +" is enqueues");

                }
                else if(rear>=capacity-1){
                    rear = 0;
                    array[rear] = data;
                    System.out.println(data +" is enqueues");

                }
                else{
                    rear++;
                    array[rear] = data;
                    System.out.println(data +" is enqueues");

                }
            }
        }
    }
    boolean isFull(){
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return 0;
        }
        else{
            if(front >= capacity-1){
                int del = array[front];
                front = 0;
                System.out.println(del + "is deleted");
                return del;
            }
            else if(front ==rear){
                //only  1 element is left
                int del = array[front];
                front = rear = 0;
                array[front] = del;
                System.out.println(del + "is deleted");
                return del;
            }
            else{
                int del = array[front];
                front++;
                System.out.println(del + "is deleted");
                return del;
            }
        }
    }
    boolean isEmpty(){
        return front ==-1 && rear ==-1;
    }
    void display(){
        if(isEmpty()){
            System.out.println("empty");
        }
        else{
            int current = front;
            while(current != rear){
                if(current >= capacity){
                    current = 0;
                }
                else{
                    System.out.print(array[current]+" ");
                    current++;
                }
            }
            System.out.print(array[rear]);
            System.out.println();
        }
    }

    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter size: -");
        int size = s.nextInt();
        Q1_CircularQueue q = new Q1_CircularQueue(size);
        for (int i = 0; i < size; i++) {
            int data = s.nextInt();
            q.enqueue(data);
        }
        q.display();
        System.out.println("enter how many times you want to dequeue");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            q.dequeue();
        }
        q.display();
        System.out.println("enter the num of elements to be inserted");
        int siz = s.nextInt();
        for (int i = 0; i < siz; i++) {
            int data = s.nextInt();
            q.enqueue(data);
        }
        q.display();

    }

}
