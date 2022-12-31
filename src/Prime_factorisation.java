import java.util.Scanner;
public class Prime_factorisation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, temp, i = 2;

        System.out.println("Enter the number whose factors you want :");
        num = sc.nextInt();
        temp = num;
        System.out.println("The factors of " + temp + " are:");
        while (temp > 1) {
            if (temp % i == 0)
            {
                System.out.print(i + " , ");
                temp=temp/i;
            }
            else
            {
                i++;
            }
        }
    }
}