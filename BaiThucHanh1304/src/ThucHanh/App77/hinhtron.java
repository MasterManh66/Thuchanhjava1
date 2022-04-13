package ThucHanh.App77;
import java.util.Scanner;
public class hinhtron {

    protected float banKinh;
    private Scanner sc;
    public hinhtron()
    {
        sc = new Scanner(System.in);
    }
    public void nhapBanKinh()
    {
      System.out.println("Bạn dùng đơn vị tính nào: ");
      System.out.println("1- Centimet ");
      System.out.println("2- Inch ");
      Configs.donVi = sc.nextInt();
      System.out.println("Hãy nhập vào bán kính hình tròn: ");
      banKinh = sc.nextFloat();
      }
    public void inThongTin()
    {
      if(Configs.donVi == Configs.DON_VI_CM)
      {
        System.out.println("Hinh tron co ban kinh: " + banKinh + " cm");
        System.out.println("Tuong duong " + Configs.ChuyenCentimetSangInch(banKinh) + " inch");
      }
      else
      {
        System.out.println("Hinh tron co ban kinh: " + banKinh + " inch");
        System.out.println("Tuong duong " + Configs.ChuyenInchSangCentimet(banKinh) + " cm");
      }
    }
}
