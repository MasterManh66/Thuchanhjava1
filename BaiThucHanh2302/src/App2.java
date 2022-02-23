package src;
public class App2 {
    public static void main(String[] args) {
        int a=3,b=6,c=6;

        if(a+b>c && b+c>a && c+a>b)
          {
                System.out.println("a,b,c la ba canh cua tam giac !!! ");
                if( a == b && b == c )
                   System.out.println("Day la tam giac deu !!!");

                if( a==b || b == c || c == a)
                    System.out.println("Day la tam giac can !!!");

            }
         else
            System.out.println("Khong la 3 canh cua tam giac !!! ");

        if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)
            System.out.println("La tam giac vuong !!!");

         double p = (a+b+c)/2.0;
         double s = Math.sqrt(p-a)*(p-b)*(p-c);
         System.out.println("Dien tich tam gia : s = " +s);
    }
}
