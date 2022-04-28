package Shape;
import java.util.Scanner;
public class Triangle extends Point {
  private Double hoanhDoDiemThuNhat;
  private Double hoanhDoDiemThuHai;
  private Double hoanhDoDiemThuBa;
  private Double tungDoDiemThuNhat;
  private Double tungDoDiemThuHai;
  private Double tungDoDiemThuBa;

  public void nhapDiem() 
  {
    System.out.println("---Nhap diem thu nhat---");
    System.out.print("Nhap hoanh do: ");
    hoanhDoDiemThuNhat = sc.nextDouble();
    System.out.print("Nhap tung do: ");
    tungDoDiemThuNhat = sc.nextDouble();
    System.out.println("---Nhap diem thu hai---");
    System.out.print("Nhap hoanh do: ");
    hoanhDoDiemThuHai = sc.nextDouble();
    System.out.print("Nhap tung do: ");
    tungDoDiemThuHai = sc.nextDouble();
    System.out.println("---Nhap diem thu ba---");
    System.out.print("Nhap hoanh do: ");
    hoanhDoDiemThuBa = sc.nextDouble();
    System.out.print("Nhap tung do: ");
    tungDoDiemThuBa = sc.nextDouble();
  }

  public void kiemTraTamGiac() 
  {
    Double a; // Độ dài điểm thứ nhất đến thứ hai
    Double b; // Độ dài điểm thứ hai đến thứ ba
    Double c; // Độ dài điểm thứ ba đến thứ nhất
    a = Math.sqrt(
        Math.pow(hoanhDoDiemThuHai - hoanhDoDiemThuNhat, 2) + Math.pow(tungDoDiemThuHai - tungDoDiemThuNhat, 2));
    b = Math
        .sqrt(Math.pow(hoanhDoDiemThuBa - hoanhDoDiemThuHai, 2) + Math.pow(tungDoDiemThuBa - tungDoDiemThuHai, 2));
    c = Math.sqrt(
        Math.pow(hoanhDoDiemThuNhat - hoanhDoDiemThuBa, 2) + Math.pow(tungDoDiemThuNhat - tungDoDiemThuBa, 2));
    if (a + b <= c || a + c <= b || c + b <= a)
      System.out.println("Day khong phai la mot tam giac ! ");
    else{
      if (a == b && b == c)
        System.out.println("Day la tam giac deu ! ");
      else if (a == b || b == c || c == a) {
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
          System.out.println("Day la tam giac vuong can ! ");
        else
          System.out.println("Day la tam giac can ");
      } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
        System.out.println("Day la tam giac vuong ! ");
      else
        System.out.println("Day la tam giac thuong ! ");
    }
  }
}
