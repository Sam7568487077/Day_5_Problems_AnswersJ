import java.lang.Math;
import java.util.Scanner;

public class Power_2 {
    public static void main(String[] args) {
        int table;
        Scanner sc=new Scanner(System.in);
        System.out.println("The Table of 2 till the power of 32 ");
        System.out.print(" Enter the power from 1 to 32 :");
        int n =sc.nextInt();
        System.out.println("\n");
        for (int i=0;i<=n;i++)
        {
            table=(int) Math.pow(2,i);
            System.out.println("2^"+ i +" = "+ table);
        }
    }
}
