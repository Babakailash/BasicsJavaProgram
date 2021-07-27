import java.util.Scanner;

class SumArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0, i;

        if (arr.length <= 1000 && n > 0) {
            for (i = 0; i < arr.length; i++) {
                System.out.print("Enter the number:" + (i + 1) + ": ");
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
            }
            System.out.print("Total sum: " + sum);
        } else {
            System.out.println("This is exceed the limit // if 0 , not valid");
        }
    }
}