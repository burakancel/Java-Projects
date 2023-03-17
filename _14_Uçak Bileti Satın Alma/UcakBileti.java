import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km, yas, tip;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe Giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipinizi Seçiniz :1-> Gidiş  2->Gidiş Dönüş : ");
        tip = input.nextInt();
        double normalTutar = km * 0.10;
        System.out.println("Normal Tutar : " + normalTutar);
        if(km > 0 && yas > 0 && tip < 0 && tip > 3){
            if (yas < 12) {
            double yasİndirim = normalTutar*0.50;
            if (tip == 2) {
                double indFiyat = normalTutar-yasİndirim;
                double gidisDonusİnd=indFiyat*0.2;
                double toplamTutar=(indFiyat-gidisDonusİnd)*2;
                System.out.println("Yaş İndirimi + Gidiş Dönüş İndirimi Fiyat : " + toplamTutar);
            } else {
                System.out.println("Sadece Yaş İndirimi Fiyat : " + yasİndirim);
            }
        } else if (yas >= 12 && yas <= 24) {
            double yasİndirim = normalTutar *0.10;
            if (tip == 2) {
                double indFiyat = normalTutar-yasİndirim;
                double gidisDonusİnd=indFiyat*0.2;
                double toplamTutar=(indFiyat-gidisDonusİnd)*2;
                System.out.println("Yaş İndirimi + Gidiş Dönüş İndirimi Fiyat : " + toplamTutar);
            } else {
                System.out.println("Sadece Yaş İndirimi Fiyat : " + yasİndirim);
            }
        }else if (yas >= 65) {
            double yasİndirim = normalTutar *0.30;
            if (tip == 2) {
                double indFiyat = normalTutar-yasİndirim;
                double gidisDonusİnd=indFiyat*0.2;
                double toplamTutar=(indFiyat-gidisDonusİnd)*2;
                System.out.println("Yaş İndirimi + Gidiş Dönüş İndirimi Fiyat : " + toplamTutar);
            } else {
                System.out.println("Sadece Yaş İndirimi Fiyat : " + yasİndirim);
            }}
        else if(yas>26&&yas<=64){
            double yasİndirim = normalTutar;
            if(tip==2){
                double indFiyat = yasİndirim;
                double gidisDonusİnd=normalTutar*0.2;
                double toplamTutar=(indFiyat-gidisDonusİnd)*2;
                System.out.println("Yaş İndirimi + Gidiş Dönüş İndirimi Fiyat : " + toplamTutar);

            }else{
                System.out.println("İndirimsiz Gidiş"+normalTutar);
            }

        }

         }
         else{
            System.out.println("Hatali Giriş Yaptınız");

         }
        }

}
