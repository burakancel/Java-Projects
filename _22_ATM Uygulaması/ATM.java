import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName,passWord;
        Scanner input = new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;
        while(right>0){
            System.out.print("Kullanıcı Adı Giriniz : ");
            userName=input.nextLine();
            System.out.print("Parola Adı Giriniz : ");
            passWord=input.nextLine();
            if(userName.equals("patika")&&passWord.equals("dev123")){
                System.out.println("Merhaba Giriş Yaptınız, Bankamatiktesiniz");
               do {
                   System.out.println("Yapmak İstediğiniz İşlemi Seçiniz : ");
                   System.out.println( "1-Para Yatırma\n"+
                           "2-Para Çekme\n"+
                           "3-Bakiye Sorgula\n"+
                           "4-Çıkış");
                   select=input.nextInt();

                   switch (select){
                       case 1:
                           System.out.println("Para Yatırma : ");
                           int price=input.nextInt();
                           price+=balance;
                           System.out.println(price);

                       break;
                       case 2:
                           System.out.println("Para Miktarı : ");
                            price =input.nextInt();
                           if (price>balance){
                               System.out.println("Bakiye Yetersiz");
                           }else{
                               balance -= price;
                           }break;
                       case 3:
                           System.out.println("Bakiyeniz"+balance);
                           break;
                   }
                   System.out.println("Tekrar Görüşmek Üzere");
                   break;
               }while(select!=4);
            }else {
                right--;
                System.out.println("Hatali Giriş Tekrar deneyiniz");
                if(right==0){
                    System.out.println("Hesabınız Bloke Olmuştur Lütfen Bankayı arayın");
                }else{
                    System.out.println("Kalan Hakkınız : "+right);
                }

            }
        }
    }
}
