package SetA;

public class ___char_queue {
    public  int front , rear;
    public static char[] array;
    public static int capacity;
//    public int num_of_even;

    ___char_queue(int c){
        front = rear = 0;
        capacity = c;
        array = new char[capacity];
//        num_of_even = 0;
    }

    void enqueue(char data){
        if(rear == capacity){
            System.out.println("queue is full");
        }
        else{
            array[rear] = data;
            rear++;
//            if(data%2==0){
//                num_of_even++;
//            }
        }
    }

    char dequeue(){
        if(front == rear){
            System.out.println("queue is full");
            return 0;
        }
        else{
            char del = array[0];
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
}
