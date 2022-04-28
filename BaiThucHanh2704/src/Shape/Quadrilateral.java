package Shape;

public class Quadrilateral extends Point {
    private Double hoanhDoDiemThuNhat;
    private Double hoanhDoDiemThuHai;
    private Double hoanhDoDiemThuBa;
    private Double hoanhDoDiemThuTu;
    private Double tungDoDiemThuNhat;
    private Double tungDoDiemThuHai;
    private Double tungDoDiemThuBa;
    private Double tungDoDiemThuTu;
  
    public void nhapDiem() {
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
      System.out.println("---Nhap diem thu tu---");
      System.out.print("Nhap hoanh do: ");
      hoanhDoDiemThuTu = sc.nextDouble();
      System.out.print("Nhap tung do: ");
      tungDoDiemThuTu = sc.nextDouble();
    }
  
    public void kiemTraTuGiac() {
      Double a; // Độ dài điểm thứ nhất đến thứ hai
      Double b; // Độ dài điểm thứ hai đến thứ ba
      Double c; // Độ dài điểm thứ ba đến thứ tư
      Double d; // Độ dài điểm thứ tư đến thứ nhất
      Double e; // Độ dài điểm thứ nhất đến thứ ba;
      Double f; // Độ dài điểm thứ hai đến thứ tu;
      a = Math.sqrt(
          Math.pow((hoanhDoDiemThuHai - hoanhDoDiemThuNhat), 2) + Math.pow((tungDoDiemThuHai - tungDoDiemThuNhat), 2));
      b = Math
          .sqrt(Math.pow((hoanhDoDiemThuBa - hoanhDoDiemThuHai), 2) + Math.pow((tungDoDiemThuBa - tungDoDiemThuHai), 2));
      c = Math
          .sqrt(Math.pow((hoanhDoDiemThuTu - hoanhDoDiemThuBa), 2) + Math.pow((tungDoDiemThuTu - tungDoDiemThuBa), 2));
      d = Math.sqrt(
          Math.pow((hoanhDoDiemThuNhat - hoanhDoDiemThuTu), 2) + Math.pow((tungDoDiemThuNhat - tungDoDiemThuTu), 2));
      e = Math.sqrt(
          Math.pow((hoanhDoDiemThuBa - hoanhDoDiemThuNhat), 2) + Math.pow((tungDoDiemThuBa - tungDoDiemThuNhat), 2));
      f = Math
          .sqrt(Math.pow((hoanhDoDiemThuTu - hoanhDoDiemThuHai), 2) + Math.pow((tungDoDiemThuTu - tungDoDiemThuHai), 2));
      if (a + b == e || b + c == f || c + d == e || a + d == f)
        System.out.println("Bon diem khong tao thanh tu giac");
      else {
        if (a == b && b == c && c == d) {
          if ((a * a + b * b - e * e) / (2 * a * b) == 0 || (b * b + c * c - f * f) / (2 * b * c) == 0
              || (c * c + d * d - e * e) / (2 * c * d) == 0 || (d * d + a * a - f * f) / (2 * d * a) == 0)
            System.out.println("Day la hinh vuong");
          else
            System.out.println("Day la hinh thoi");
        } else if (a == c && b == d) {
          if ((a * a + b * b - e * e) / (2 * a * b) == 0 || (b * b + c * c - f * f) / (2 * b * c) == 0
              || (c * c + d * d - e * e) / (2 * c * d) == 0 || (d * d + a * a - f * f) / (2 * d * a) == 0)
            System.out.println("Day la hinh chu nhat");
          else
            System.out.println("Day la hinh binh hanh");
        } else
          System.out.println("Day la tu giac thuong");
      }
    }
}
