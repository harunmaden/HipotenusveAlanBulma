import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args){
        /*
        int a, b;
        double c;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = inp.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = inp.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs : " + c);
        */

        int a, b, c;
        double u, alan;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = inp.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = inp.nextInt();
        System.out.print("3. Kenarı Giriniz : ");
        c = inp.nextInt();
        u =(a+b+c) / 2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Alan : " + alan);

    }
}
