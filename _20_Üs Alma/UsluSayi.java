import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int sayi1,sayi2,i,total=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak Sayiyi Girin : ");
        sayi1=input.nextInt();
        System.out.print("Üs Olacak Sayiyi Girin : ");
        sayi2=input.nextInt();
        for (i=1;i<=sayi2;i++){
            total*=sayi1;
        }
        System.out.println("Cevap : "+total);

    }
}
