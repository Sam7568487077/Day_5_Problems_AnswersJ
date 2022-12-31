import java.util.Scanner;
public class Q_And_R {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividend, divisor, quotient, remainder;
        System.out.println("Enter the dividend:");
        dividend = sc.nextDouble();
        System.out.println("\n");
        System.out.println("Enter the divisor:");
        divisor = sc.nextDouble();
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.print("The quotient is: " + quotient);
        System.out.println("\n");
        System.out.println("The remainder is:" + remainder);
    }
}
