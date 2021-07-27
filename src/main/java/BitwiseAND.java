import java.util.Scanner;

public class BitwiseAND {
    public  static void AND(int x, int y){
        System.out.println("x & y = "+(x & y));
        // if only if both 1 return 1, otherwise return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x value: ");
        int x = sc.nextInt();
        System.out.print("Enter y value: ");
        int y = sc.nextInt();
        AND(x,y);
    }
}
