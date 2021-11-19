public class q21 {

    public static void main(String[] args) {
        
        //calculate the sum of the digits of a 3-digit number.

        int a=123 , b,c,d,e;

        b=a/100 ;
        d = a%10;
        c=(a/10)-(b*10);

        e=b + c+d;

        System.out.println(e);

        

    }
    
}
