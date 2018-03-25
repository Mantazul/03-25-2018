package array;

import java.util.Random;
import java.util.Scanner;

public class UseArray {
    public static void main(String[] args) {
        int limit = 5;
        int  [] array  = new int[limit];
        //Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please enter some integer number: ");
        for(int i=0; i<array.length; i++) {
            //array[i] = sc.nextInt();//
            array[i] = random.nextInt(100);
        }
        for(int j=0; j<array.length; j=j+1) {
            System.out.println(array[j]);
        }

    }

}
