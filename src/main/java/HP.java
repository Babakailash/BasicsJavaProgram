import java.util.Scanner;

public class HP {
    public static void HPTerms(int n){
        double series=0.0;
        for (double i=1; i<=n; i++){
            series = series + 3/i;
            System.out.print(series+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter HP terms: ");
        int n = sc.nextInt();
        HPTerms(n);
    }
}
