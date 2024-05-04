import java.util.Scanner;

public class guess_my_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int my_number = (int) (Math.random() * 100);
        int user_number = 0;

        do {
            System.out.println("guess the number");
            user_number = sc.nextInt();

            if (user_number == my_number) {
                System.out.println("woooohhh !   correct");
                break;
            } else if (user_number < my_number) {
                System.out.println("your number is too small");
            } else {
                System.out.println("your number is too large");
            }
        } while (user_number >= 0);
        {
            System.out.println("my number was :");
            System.out.println(my_number);
        }

        sc.close();
    }
}
