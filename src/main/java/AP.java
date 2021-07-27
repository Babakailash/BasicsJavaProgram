import java.util.Scanner;

public class AP {
    public static void APTerms(int a, int d, int n){
        int current_Term;
        for(int i=1; i<n; i++){
            current_Term = a+(i-1)*d;
            System.out.print(current_Term+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st term: ");
        int a = sc.nextInt();
        System.out.print("enter difference: ");
        int d = sc.nextInt();
        System.out.print("enter total terms: ");
        int n = sc.nextInt();
        APTerms(a,d,n);
    }
}
