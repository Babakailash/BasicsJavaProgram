import java.util.Scanner;

public class BitwiseXOR {
        public  static void XOR(int x, int y){
            System.out.println("x ^ y = "+(x ^ y));
            // both same return 0, otherwise return 1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter x value: ");
            int x = sc.nextInt();
            System.out.print("Enter y value: ");
            int y = sc.nextInt();
            XOR(x,y);
        }
}
