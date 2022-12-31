import java.util.Scanner;
public class Harmonic_Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double series=0;
        double sum=0;
        System.out.print(" ENter the number of terms: ");
        double term=sc.nextDouble();
        for (double i=term;i>0;i--)
        {

            System.out.print(1 +" "+"/"+i);

            System.out.print(" , ");
        }
        System.out.println("\n");

        for (double j=term;j>0;j--) {
            series = (1 / j);

            System.out.print(series);

            System.out.print(" , ");
        }
        System.out.println("\n");
        sum =sum+series;
        System.out.print("\n");
        System.out.print("The sum of thr harmonic series is:" + sum);


    }
}

