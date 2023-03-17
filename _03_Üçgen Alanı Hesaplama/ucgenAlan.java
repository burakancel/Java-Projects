import java.util.Scanner;

public class ucgenAlan {




        public static void main(String[] args) {

            int a,b,c;
            double cevre,alan,u;

            Scanner input= new Scanner(System.in);
            System.out.print("A kenarı giriniz : ");
            a=input.nextInt();
            System.out.print("B kenarı giriniz : ");
            b=input.nextInt();
            System.out.print("C kenarı giriniz : ");
            c=input.nextInt();
            u=(a+b+c)/2;
            cevre=2*u;
            alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
            System.out.println("Üçgenin Çevresi : "+cevre);
            System.out.print("Üçgenin Alanı : "+alan);







        }


}
