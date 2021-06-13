package SetA;

import java.util.Scanner;

public class Q6_reverseAString {
    static ___char_queue q;
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
    String str = s.nextLine();
    q = new ___char_queue(str.length());
        System.out.println("enter the elments one by one");
        for (int i = 0; i < str.length(); i++) {
            q.enqueue(str.charAt(i));
        }
        reverse();

    }
    static void reverse(){
        if(q.front == q.rear){
            return;
        }
        else{
            char del = q.dequeue();
            reverse();
            System.out.print(del+" ");
        }
    }

}
