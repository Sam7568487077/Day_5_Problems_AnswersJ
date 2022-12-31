import java.util.Scanner;
public class Vowel_Or {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Alphabet :");
        char alp = sc.next().charAt(0);

        switch (alp) {
            case 'A':
                System.out.println("Its a vowel");
                break;
            case 'E':
                System.out.println("Its a vowel");
                break;
            case 'I':
                System.out.println("Its a vowel");
                break;
            case 'O':
                System.out.println("Its a vowel");
                break;
            case 'U':
                System.out.println("Its a vowel");
                break;
            default:
                System.out.println("Its a Consonant");
                break;
        }
    }
}

