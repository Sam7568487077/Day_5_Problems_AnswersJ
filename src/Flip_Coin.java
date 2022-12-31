import java.util.Scanner;
public class Flip_Coin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float head=0;
        float tail=0;
        float perc1=0;
        float perc2=0;
        System.out.print("Enter the number of times the coin to be flipped :");
        float num=sc.nextFloat();
        System.out.println("\n");

        for(int i=1;i<=num;i++) {
            double flip = Math.floor(Math.random() * 10) % 2;
            if (flip == 0) {
                System.out.print("The outcome is Head");
                System.out.println("\n");
                head=head+1;

            } else {
                System.out.print("The outcome is Tail");
                System.out.println("\n");
                tail = tail + 1;
            }
        }
        perc1=(head*100)/num;
        perc2=(tail*100)/num;
        System.out.print("The percentage of getting head is:" + perc1);
        System.out.println("\n");
        System.out.print("The percentage of getting Tail is:" + perc2);

    }
}