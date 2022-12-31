import java.util.Scanner;
public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c=0, d=0;
        System.out.print("Enter the first Number :");
        a = sc.nextInt();
        System.out.print("Enter the second Number :");
        b = sc.nextInt();
        System.out.print("The numbers are A = " + a + "  and B = " + b);
        d = a;
        c = b;
        System.out.println("\n");
        System.out.println("After swapping");
        System.out.println("\n");
        System.out.print("The numbers are A = " + c + "  and B = " + d);
    }
}

