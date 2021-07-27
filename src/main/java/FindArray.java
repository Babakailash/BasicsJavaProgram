import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Elements of array: ");
        int value = scan.nextInt();

        //System.out.println(value);
        int num[] = new int[value];
        System.out.println("Enter all the Element");


//        int[] num = {14,11,18,10,21};
        int k=3;
        for (int i=0;i< num.length-1;i++){
            for (int j=i+1; j<num.length; j++){
                if(num[i] > num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j]= temp;
                }
            }

            if (i == k-1){
                System.out.println(k+ "rd Smallest Element is " +num[i]);
            }
        }
        System.out.println("--------------------------");
        for (int i = 0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}