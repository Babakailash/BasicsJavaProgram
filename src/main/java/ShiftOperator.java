import java.util.Scanner;

public class ShiftOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int x = sc.nextInt();
        System.out.println("RightShiftOperator(b=a/2^n) x>>2: "+(x>>2));
        System.out.println("LeftShiftOperator(b=a*2^n) x<<2: "+(x<<2));
        System.out.println("RightShiftOperator(b=a/2^n) x>>>2: "+(x>>>2));

    }
}
