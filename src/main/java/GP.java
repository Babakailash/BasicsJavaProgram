import java.util.Scanner;

public class GP {
    public static void GPTerms(int a,int r,int n){
        double current_term, current_term2;
        for(int i = 0; i<n; i++) {
            current_term = a * Math.pow(r, i);
            System.out.print( current_term + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st Term: ");
        int a = sc.nextInt();
        System.out.print("enter ratio term: ");
        int r = sc.nextInt();
        System.out.print("enter total terms: ");
        int n = sc.nextInt();
        System.out.println(" ");
        GPTerms(a,r, n);
    }
}
