import java.util.Scanner;

public class Largest_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the First Number :");
        a= sc.nextInt();
        System.out.print("Enter the Second Number :");
        b= sc.nextInt();
        System.out.print("Enter the Third Number :");
        c= sc.nextInt();


        if (a > b && a >c)
        {
            System.out.println("A is the greatest");
        } else if (b>c) {
            System.out.println("B is greatest");

        }
        else
        {
            System.out.println("C is the greatest");
        }
    }
}
