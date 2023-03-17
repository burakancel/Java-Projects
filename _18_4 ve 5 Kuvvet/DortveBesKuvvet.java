import java.util.Scanner;

public class DortveBesKuvvet {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        sayi=input.nextInt();

        for(int i = 1; i<=sayi; i*=4){

            System.out.println("4 ün Katları : "+i);

        }
        System.out.println("----------");
        for(int j=1; j<=sayi;j*=5){
            System.out.println("5 in Katları : "+j);
        }

    }
}
