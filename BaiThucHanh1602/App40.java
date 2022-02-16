import java.util.Scanner;

public class App40 {
    public static void main(String[] args) {
     int ngay;
     Scanner m = new Scanner(System.in);
     ngay = m.nextInt();
     
     System.out.println(" Nhap so ngay tu 2 -> 8 !!!");
     switch (ngay) {
        case 2 :
            System.out.println(" Thu Hai ");             
            break;
        case 3 :
            System.out.println(" Thu Ba ");
            break;
        case 4 :
            System.out.println(" Thu Tu ");
            break;
        case 5 : 
            System.out.println(" Thu Nam ");
            break;
        case 6 : 
            System.out.println(" Thu Sau ");
            break;
        case 7 : 
            System.out.println(" Thu Bay ");
            break;
        case 8 :
            System.out.println(" Chu Nhat ");
            break;
        default: System.out.println(" So khong thuoc cac ngay trong tuan !!!");    
     }
    }
}
