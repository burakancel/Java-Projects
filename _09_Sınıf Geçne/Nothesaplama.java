import java.util.Scanner;

public class Nothesaplama {

    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        double ort = (mat + fizik + turkce + kimya + muzik) / 5;

        if (mat < 0 || mat > 100) {
            double ort1 = (fizik + turkce + kimya + muzik) / 4;
            System.out.println("Matematik Hatalı Girdiniz Diğer Derslerin Ort : " + ort1);
        } else if (fizik < 0 || fizik > 100) {
            double ort2 = (mat + turkce + kimya + muzik) / 4;
            System.out.println("Fizik Hatalı Girdiniz Diğer Derslerin Ort : " + ort2);
        } else if (turkce < 0 || turkce > 100) {
            double ort3 = (mat + fizik + kimya + muzik) / 4;
            System.out.println("Türkçe Hatalı Girdiniz Diğer Derslerin Ort : " + ort3);
        }
        else if (kimya < 0 || kimya > 100) {
            double ort4 = (mat + fizik + turkce + muzik) / 4;
            System.out.println("Kimya Hatalı Girdiniz Diğer Derslerin Ort : " + ort4);
        }else if (muzik < 0 || muzik > 100) {
            double ort5 = (mat + fizik + kimya + turkce) / 4;
            System.out.println("Müzik Hatalı Girdiniz Diğer Derslerin Ort : " + ort5);
        }
        else if (ort>=55){
            System.out.println("Tüm Dersleri Doğru Yazdınız Sınıfı Geçtiniz ! Tebrikler : "+ort);

        }
        else{
            System.out.println("Sınıfta Kaldınız" + ort);
        }

    }
}
