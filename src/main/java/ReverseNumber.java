import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        intReverse(count);
    }

        public static void intReverse(int number) {
            int  reverse = 0;
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            intReverse(reverse);

            System.out.println("The reverse of the given number is: " + reverse);
        }
    }

