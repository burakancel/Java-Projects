import java.util.Scanner;

public class CiftToplam {

    public static void main(String[] args) {
        int sayi;
        int toplam = 0;
        Scanner input= new Scanner(System.in);


        do{System.out.print("Bir sayi Giriniz : ");
            sayi=input.nextInt();
            if(sayi%2==0 && sayi%4==0){
                toplam+=sayi;


            }else if (sayi%2==1){
                System.out.println("Tek Sayi Girdiniz ! ! ! ");
                System.out.println("Çift Sayilarin Toplamı : "+toplam);
                break;
            }

        }while (sayi>0);
    }
}
