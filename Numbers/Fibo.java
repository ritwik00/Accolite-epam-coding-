package Numbers;

public class Fibo {
    public static void main(String[] args) {
        int range =50;
        int a=0,b=1,c=0;
        System.out.print(a+",");
        System.out.print(b+",");

        for (int i = 2; i <=range; i++) {
            c=a+b;
            if(c<= range){
                System.out.print(c+",");
                a=b;
                b=c;
            }
        }

    }
}
