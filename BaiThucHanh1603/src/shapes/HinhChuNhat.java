package shapes;
import java.util.Scanner;

public class HinhChuNhat {
     float dai;
     float rong;
     float cv;
     float dt;

     public void nhapChieuDai(){
         System.out.println("Hãy nhập vào Chiều dài Hình Chữ Nhật : ");
         Scanner sc = new Scanner(System.in);
         dai = sc.nextFloat();
     }

     public void nhapChieuRong(){
         System.out.println("Hãy nhập vào chiều rộng Hình Chữ Nhật : ");
         Scanner sc = new Scanner(System.in);
         rong = sc.nextFloat();
     }

     public void tinhChuVi(){
         cv = 2 * (dai + rong);
     }
     public void tinhDienTich(){
         dt = dai * rong;
     }

     public void inChuVi(){
         System.out.println("Chu vi Hình chữ Nhật : " + cv);
     }

     public void inDienTich(){
         System.out.println("Diện tích Hình Chữ Nhật : " + dt);
     }
}
