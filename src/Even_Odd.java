import java.util.Scanner;
public class Even_Odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter a number : ");

        a=sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("The number " + a + " is an even number");
        } else {
            System.out.println("The number " + a + " is a odd number");
        }
    }
}
