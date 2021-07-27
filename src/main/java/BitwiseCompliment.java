import java.util.Scanner;

public class BitwiseCompliment {
    static  void Compliment(int x){
        System.out.println("x => ~x: = "+(~x));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x value: ");
        int x = sc.nextInt();
        Compliment(x);
    }
}
