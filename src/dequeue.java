import java.util.Scanner;

class dequeue
{
    private static int TOTAL = 100;
    int  arr[],front,rear,size;

    public dequeue(int size)
    {
        arr = new int[TOTAL];
        front = -1;
        rear = 0;
        this.size = size;
    }

    boolean isFull()
    {
        return ((front == 0 && rear == size-1)||
                front == rear+1);
    }

    boolean isEmpty ()
    {
        return (front == -1);
    }

    void enqueueAtFront(int key)
    {
        if (isFull())
        {
            System.out.println("QUEUE IS FULL");
            return;
        }

        if (front == -1)
        {
            front = 0;
            rear = 0;
        }

        else if (front == 0) front = size - 1 ;

        else front = front-1;

        arr[front] = key ;
    }

    void enqueueAtRear(int key)
    {
        if (isFull())
        {
            System.out.println(" QUEUE IS FULL ");
            return;
        }

        if (front == -1)
        {
            front = 0;
            rear = 0;
        }

        else if (rear == size-1)
            rear = 0;

        else
            rear = rear+1;

        arr[rear] = key ;
    }

    void dequeueAtFront()
    {
        if (isEmpty()) {
            System.out.println("QUEUE IS EMPTY");
            return;
        }
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
            if (front == size -1) front = 0;
            else front = front+1;
    }

    void dequeueAtRear()
    {
        if (isEmpty())
        { System.out.println(" QUEUE IS EMPTY");
            return ;
        }
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if (rear == 0)
            rear = size-1;
        else
            rear = rear-1;
    }

    int peek()
    { if (isEmpty())
        {
            System.out.println(" QUEUE IS EMPTY");
            return -1 ;
        }
        return arr[front];
    }

    int peekAtRear()
    { if(isEmpty() || rear < 0)
        {
            System.out.println(" QUEUE IS FULL");
            return -1 ;
        }
        return arr[rear];
    }

    public static void main(String[] args)
    {
        Scanner s = new  Scanner(System.in);
        System.out.println("size?");
        int size = s.nextInt();
        s.nextLine();
        dequeue q = new dequeue(size);
        System.out.println("y or n");
        String str = s.nextLine();
        while (str.equals("y")){
            System.out.println("press the following keys");
            System.out.println("1.Enque at front");
            System.out.println("2.enqueue at rear");
            System.out.println("3.dequue at front");
            System.out.println("4.dequeue at rear");
            System.out.println("5.peek at front");
            int input = s.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("enter the data");
                    int data = s.nextInt();
                    q.enqueueAtFront(data);
                }
                case 2 -> {
                    System.out.println("emqueue at rear");
                    int dataAtRear = s.nextInt();
                    q.enqueueAtRear(dataAtRear);
                }
                case 3 -> {
                    System.out.println(q.peek());
                    q.dequeueAtFront();
                }
                case 4 -> {
                    System.out.println(q.peekAtRear());
                    q.dequeueAtRear();
                }
                case 5 -> {
                    System.out.println("peek at front = " + q.peek());
                    System.out.println("rear at rear = " + q.peekAtRear());
                }
            }
            s.nextLine();
            System.out.println("y or n");
            str = s.nextLine();
        }

    }
}