
import java.util.Scanner;

public class Kullanıci {

    public static void main(String[] args) {

        String username, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        username = input.nextLine();
        System.out.print("Şifre Giriniz : ");
        password = input.nextLine();

        if ((username.equals("patika")) && (password.equals("java123"))) {
            System.out.println("Giriş Yaptınız");

        } else {
            System.out.println("Yanlış Şifre Şifrenizi Değiştirmek İster Misiniz Y/N");
            String yesno = input.nextLine();
            if (yesno.equals("y")) {
                System.out.println("Yeni Şİfre Giriniz");
                String yenisifre = input.nextLine();
                if (yenisifre.equals("java1234")) {
                    System.out.println("Şifre Değiştirildi : " + yenisifre);
                    System.out.println("Sisteme Giriş Yapınız");
                } else if (yenisifre.equals("java123")) {
                    System.out.println("Yeni Şifre Eskisi İle Aynı olamaz");
                }

            } else {
                System.out.println("İşlem yapılamıyor Programdan Çıkıldı.");
            }
        }
    }
}
