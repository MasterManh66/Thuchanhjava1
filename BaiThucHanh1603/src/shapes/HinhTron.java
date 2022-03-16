package shapes;
import java.util.Scanner;
public class HinhTron{
    
        final float PI = 3.14f;
        float r;
        float cv;
        float dt;
        //cac phuong thuc
        void NhapBanKinh(){
            Scanner m = new Scanner(System.in); 
                System.out.println("Nhap Ban kinh duong tron : ");
                r = m.nextFloat();
            }
        public void tinhChuVi()
        {
            cv = 2 * PI * r;
        }
        public void tinhDienTich()
        {
            dt = PI * r * r ;
        }
        public void inChuVi()
        {
            System.out.println("Chu vi Hinh tron : " + cv);
        }
        public void inDienTich()
        {
            System.out.println("Dien tich Hinh tron : " + dt);
        }
}