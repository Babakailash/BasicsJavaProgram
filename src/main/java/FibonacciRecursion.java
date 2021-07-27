public class FibonacciRecursion {
    public static void main(String[] args) {
        int count = 10;
        fibonacci(count-2);
    }
    static int n1=0, n2=1,n3,i;
    public static void fibonacci(int count){
        if (count>0){
            n3 = n1+n2;
            System.out.print(n1+" "+n2);
            n1 = n2;
            n2 = n3;
            System.out.println(" = "+n3);
            fibonacci(count-1);
        }
    }
}
