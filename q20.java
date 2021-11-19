public class q20 {

    public static void main(String[] args) 
    
    {
        
        int a=7845 ;
        int b,c,d,e,f,g,h,i,j ;

        b=a/1000;
        c=a%10;
        d=(a/10)%10;
        e=(a/100)-(b*10);

        f=(b+2)%10;
        g=(e+2)%10;
        h=(d+2)%10;
        i=(c+2)%10;

        j = (f*1000)+ (g*100) +(h*10)+i;
        System.out.println(j);


        

    }
    
}
