import java.util.Scanner;

public class KthSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];


        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                System.out.print("");
            }

                //System.out.println( "rd Smallest Element is " + a[i]);

             System.out.print("Enter the Element " + (i + 1) + ": ");
            a[i] = sc.nextInt();

        }
        System.out.println("--------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
