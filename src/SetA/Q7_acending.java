package SetA;

import java.util.Scanner;
import java.util.Stack;

public class Q7_acending {
    static int delete = Integer.MAX_VALUE;
    static Q1_setA q;
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        q = new Q1_setA(5);
        for (int i = 0; i < 5; i++) {
            int data = s.nextInt();
            q.enqueue(data);
        }
        System.out.println();
        q.display();
        System.out.println();
        ascending();
    }
    static void ascending(){
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<q.capacity;i++){
            for(int j = 0;j<q.capacity-1;j++){

            }
        }
    }
}
