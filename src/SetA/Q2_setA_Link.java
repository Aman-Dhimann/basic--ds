package SetA;

import java.util.Scanner;

//queue implementation using linked list
public class Q2_setA_Link {
    Node front;
    Node rear;
    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
        }
    }
    void enqueue(int data){
        // no overflow condition
        if(front==null){
            front = new Node(data);
        }
        else{
            if(rear == null){
                rear = new Node(data);
                front.next = rear;
            }
            else{
                Node nwNode = new Node(data);
                rear.next = nwNode;
                rear = nwNode;
            }
        }
    }

    int dequeue(){
        //underflow check
        if(front == null){
            System.out.println("empty queue");
            return 0;
        }
        else{
            int dat = front.data;
            front = front.next;
            return dat;
        }
    }

    void display(){
        if(front == null){
            System.out.println("empty queue");
        }
        else{
            Node current = front;
            while(current!=null){
                System.out.print(current.data +" -< ");
                current = current.next;
            }
        }
    }
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Q2_setA_Link q = new Q2_setA_Link();
        System.out.println("enter the size:-");
        int size = s.nextInt();
        System.out.println("enter the data one by one");
        for (int i = 0; i < size; i++) {
            int data = s.nextInt();
            q.enqueue(data);
        }
        q.display();
        System.out.println();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println();
        q.display();

    }
}
