
import java.util.Scanner;
public class mainKdv {
    public static void main(String[] args) {

        double tutar,kdv=0.18;
        Scanner input=new Scanner(System.in);
        System.out.print("Tutar giriniz :");
        tutar = input.nextDouble();
        double kdvfiyat = (tutar*kdv)+tutar;
        System.out.println("Kdv Fiyatı :  "+kdvfiyat);
        System.out.println("Kdv oranı : "+kdv);
        double kdvMiktari = kdvfiyat-tutar;
        System.out.println("Kdv Miktarı : "+kdvMiktari);





    }
}
