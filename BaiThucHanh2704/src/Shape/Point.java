package Shape;
import java.util.Scanner;
public class Point {
  protected String tenDiem;
  protected Double hoanhDo;
  protected Double tungDo;
  public Scanner sc = new Scanner(System.in);
  public char getDiem(){
    return tenDiem;
  }
  public Double getHoanhDo(){
    return hoanhDo;
  }
  public Double getTungDo(){
    return tungDo;
  }
  public void setDiem(char diem){
    this.tenDiem = diem;
  }
  public void setHoanhDo(Double hoanhdo){
    this.hoanhDo = hoanhdo;
  }
  public void setTungDo(Double tungdo){
    this.tungDo = tungdo;
  }
  public Point(){};
  public Point(char diem,Double hoanhdo,Double tungdo){
    tenDiem = diem;
    hoanhDo = hoanhdo;
    tungDo = tungdo;
  }
  public void nhapDiem(){
    System.out.print("Nhap ten diem: ");
    tenDiem = sc.nextLine();
    System.out.print("Nhap hoanh do: ");
    hoanhDo = sc.nextDouble();
    System.out.print("Nhap tung do: ");
    tungDo = sc.nextDouble();
  }
  public void inDiem(){
    System.out.println("Diem " + tenDiem + "(" + hoanhDo + "," + tungDo + ")");
  }
}
