import java.util.Scanner;

public class BitwiseOR {
        public  static void OR(int x, int y){
            System.out.println("x | y = "+(x | y));
            // if bit is 1 return 1, otherwwise return 0;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter x value: ");
            int x = sc.nextInt();
            System.out.print("Enter y value: ");
            int y = sc.nextInt();
            OR(x,y);
        }
}
