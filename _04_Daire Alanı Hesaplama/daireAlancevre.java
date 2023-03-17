import java.util.Scanner;

public class daireAlancevre {

    public static void main(String[] args) {

        double r,cevre,alan,pi=3.14;
        Scanner input= new Scanner(System.in);

        System.out.print("R giriniz : ");
        r=input.nextDouble();
        cevre=2*pi*r;
        alan=pi*r*r;
        System.out.println("Çevresi : "+cevre);
        System.out.print("Alanı : "+alan);


    }
}
