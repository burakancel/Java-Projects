import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        n1=input.nextInt();
        System.out.print("İkinci Sayı Giriniz : ");
        n2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println("Seçiminiz Toplama : " +( n1 + n2 ));
                break;
            case 2:
                System.out.println("Seçiminiz Çıkarma : "+( n1 - n2 ));
                break;
            case 3:
                System.out.println("Seçiminiz Çarpma : "+ ( n1 * n2 ));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("0'a Bölme İşlemi Yapılamaz");
                        break;
                }
                System.out.println("Seçiminiz Bölme : "+ ( n1 / n2));

                break;

            default:
                System.out.println("Hatalı İşlem Yaptınız ! ");

        }
    }




        }
