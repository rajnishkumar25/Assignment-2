public class q22 {

    public static void main(String[] args) {
        
        //calculate the sum of the digits of a 3-digit number.

        int a=123 , b,c,d,e;

        b=a/100 ;
        d = a%10;
        c=(a/10)-(b*10);

        e=d*100 + c*10+b;

        System.out.println(e);
    
}
}
