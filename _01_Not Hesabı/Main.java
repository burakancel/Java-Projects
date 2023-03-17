import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,tarih,muzik,turkce,kimya;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notu Giriniz :  ");
        mat=input.nextInt();
        System.out.println("Fizik Notu Giriniz :  ");
        fizik=input.nextInt();
        System.out.println("Tarih Notu Giriniz :  ");
        tarih=input.nextInt();
        System.out.println("Türkçe Notu Giriniz :  ");
        turkce=input.nextInt();
        System.out.println("Kimya Notu Giriniz :  ");
        kimya=input.nextInt();
        System.out.println("Müzik Notu Giriniz :  ");
        muzik=input.nextInt();

        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        float ortalama = toplam / 6;
        System.out.println("Ortalamanız : "+ortalama);
        String sonuc=(ortalama>=60) ? "Sınıf Geçti" : "Sınıf Kaldı";
        System.out.println(sonuc);

    }
}
