package SetA;

import java.util.Scanner;

public class Q3_count_even {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the size:-");
        int size = s.nextInt();
        Q1_setA q = new Q1_setA(size);
        System.out.println("enter the elements one by one");
        for (int i = 0; i < size; i++) {
            int data = s.nextInt();
            q.enqueue(data);
        }
        System.out.println("number of even elements = "+ q.num_of_even);
    }
}
