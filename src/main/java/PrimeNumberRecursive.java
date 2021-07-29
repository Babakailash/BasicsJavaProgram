import java.util.Scanner;

public class PrimeNumberRecursive {
   static void checkPrimeNumber(int n){
        int i,m , flag = 0;
        m = n/2;

        if(n==0 || n==1){
            System.out.println("No,"+n+" is Not Prime Number!!");
        }else {
            for(i=2; i<=m; i++){
                if(n%2==0){
                    System.out.println("No,"+n+" is Not Prime Number!!");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Yes,"+n+" is Prime Number!!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for Prime Check: ");
        int n = sc.nextInt();
        checkPrimeNumber(n);


    }
}
