import java.util.Scanner;

// enqueueAtFront enqueueAtRear dequeueAtRear dequeueAtFront isfull isEmpty
public class DequeueByCQ {
    int[] arr ;
    int front;
    int rear;

    DequeueByCQ(int capacity){
        arr=new int[capacity];
        front=-1;
        rear=-1;
    }


    boolean isfull(){
        if (front==rear+1 || rear==arr.length-1 && front==0 )
            return true;
        else
            return false;
    }

    boolean isEmpty(){
        if (front==-1)
            return true;
        else
            return false;
    }

    void enqueueAtFront(int item){
        if (isfull()){
            System.out.println("cannot add");
        }else{
            if (rear==-1){
                rear=0;
            }
            if(front == -1){
                front = 0;
                arr[front] = item;
            }
            else if (front==0||front<0){
                front=arr.length-1;
                arr[front]=item;
            }
            else{
                front=front-1;
                arr[front]=item;
            }
        }

    }

    void  enqueueAtRear(int item){
        if (isfull()){
            System.out.println("cannot add");
        }else{
            if (front==-1){
                front=0;
            }
            if (rear==arr.length-1){
                rear=0;
                arr[rear]=item;
            }
            else {
                rear=rear+1;
                arr[rear]=item;
            }

        }

    }

    int dequeueAtRear(){
        int temp=0;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            temp=arr[rear];
            if (rear==0)
                rear=arr.length-1;
            else
                rear=rear-1;

        }
        return temp;
    }

    int dequeueAtFront(){
        int temp=0;
        if(isEmpty()){
            System.out.println("Underflow!! Queue is empty....");

        }
        else{
            temp = arr[front];
            if(front == rear){
                front = -1;
                rear = -1;

            }
            if(front == arr.length-1)
                front = 0;
            else
                front  = front +1;

        }
        return temp;
    }
    int peek(){
        return arr[front];
    }
    void display() {
        if (isEmpty()) {
            System.out.println("empty");
        } else {
            int current = front;
            while (current != rear) {
                if (current >= arr.length - 1) {
                    current = 0;
                } else {
                    System.out.print(arr[current] + " ");
                    current++;
                }
            }
            System.out.print(arr[rear]);
            System.out.println();
        }

    }

    public static void main(String[] args) {
//                Scanner s = new  Scanner(System.in);
//        DequeueByCQ q = new DequeueByCQ(5);
//        q.enqueueAtFront(1);
//        q.enqueueAtRear(2);
//        q.display();
//        for (int i = 0; i < q.arr.length; i++) {
//            System.out.print(q.arr[i]+" ");
//        }
        Scanner s = new  Scanner(System.in);
        System.out.println("size?");
        int size = s.nextInt();
        s.nextLine();
        DequeueByCQ q = new DequeueByCQ(size);
        System.out.println("y or n");
        String str = s.nextLine();
        while (str.equals("y")){
            System.out.println("press the following keys");
            System.out.println("1.Enque at front");
            System.out.println("2.enqueue at rear");
            System.out.println("3.dequue at front");
            System.out.println("4.dequeue at rear");
            System.out.println("5.peek at front");
            System.out.println("6. display all elements");
            int input = s.nextInt();
            switch (input){
                case 1:
                    System.out.println("enter the data");
                    int data = s.nextInt();
                    q.enqueueAtFront(data);
                    break;
                case 2:
                    System.out.println("emqueue at rear");
                    int dataAtRear = s.nextInt();
                    q.enqueueAtRear(dataAtRear);
                    break;
                case 3:
                    int deque = q.dequeueAtFront();
                    System.out.println(deque);
                    break;
                case 4:
                    int deq = q.dequeueAtRear();
                    System.out.println(deq);
                    break;

                case 5:
                    System.out.println("peek at front = "+q.peek());
                    break;

                case 6:
                    System.out.println("all elements : = ");
                    q.display();
            }
            s.nextLine();
            System.out.println("y or n");
            str = s.nextLine();
        }


    }



}