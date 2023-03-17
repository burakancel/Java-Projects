import java.util.Scanner;

public class EnbuyukEnKucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayi Gireceksiniz : ");
        int sayi=input.nextInt();
        int enBuyuk=0;
        int enKucuk=0;
        for(int i=1;i<=sayi;i++){

            System.out.print(" Sayi Giriniz : ");
            int sayi2=input.nextInt();
            if(i==1){
                enKucuk=sayi2;
                enBuyuk=sayi2;
            }else {
                if(sayi2>enBuyuk){
                    enBuyuk=sayi2;
                }
                if (sayi2<enKucuk){
                    enKucuk=sayi2;
                }
            }
            System.out.println(enBuyuk);
            System.out.println(enKucuk);


        }
    }
}
