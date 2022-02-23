package src;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
    int a  ,b , gcd = 1;
    
    try (Scanner m = new Scanner(System.in)) {
        System.out.println("Nhap so a : ");
        a = m.nextInt();
        System.out.println("Nhao so b : ");
        b = m.nextInt();
    }
    for(int i = 1 ; i <= a && i <= b ; i++)
    {
        if(a % i == 0 && b % i == 0)
           gcd = i;
    }
    System.out.printf("Uoc chung lon nhat cua %d va %d la : %d ",a,b,gcd);

    }
}
