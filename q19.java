public class q19 {
    //Write a program to calculate the sum of the first and the second last digit of a 5 digit.

    public static void main(String[] args) {
        
        int a =12345 ;

        int b =a/10000;

        int c = (a/10)%10;

        System.out.println( b);
        System.out.println(c);
        System.out.println(b+c);
    }
    
}
