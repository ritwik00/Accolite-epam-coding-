package Accolite;

public class PrintNaturalNumberWithoutLoop {
    public static void main(String[] args) {
        int n=10;
        printNumber(n);

    }
    public static void printNumber(int n){
        
        if (n>0) {
            printNumber(n-1);
            System.out.println(n);
        }
    }
}
