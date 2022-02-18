import java.util.Scanner;

public class App47 {
    public static void main(String[] args) {
        int so , tong = 0;

        Scanner m = new Scanner(System.in);

        do
        {
            System.out.print("Nhap cac so nguen : ");
            so = m.nextInt();

            tong = tong + so;
        }while(tong < 100);
        System.out.println("Tong cac so nguyen vua nhap la : " +tong);
    }
}
