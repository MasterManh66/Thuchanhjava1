import java.util.Scanner;

import javax.sound.midi.MidiChannel;

public class App35 {
    public static void main(String[] args) {
        int a,b,min;

        Scanner m = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen a : ");
        a = m.nextInt();
        System.out.print("Nhap vao so nguyen b : ");
        b = m.nextInt();

        if(a > b)
        {
            min = b;
            System.out.println("So nho nhat trong hai so "+a+" va "+b+" la : " +min);
        }
        else
        {
            min = a;
            System.out.println("So nho nhat trong hai so "+a+" va "+b+" la : " +min);
        }
    }
}
