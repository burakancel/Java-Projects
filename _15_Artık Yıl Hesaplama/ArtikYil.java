import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Yil Giriniz : ");
        yil=input.nextInt();
        boolean artikMi=true;

        if(yil%4==0){
            if((yil%100)==0){
                if(yil%400==0){
                    artikMi=true;
                }else{
                    artikMi=false;
                }

            }

        }
        else{
           artikMi=false;
        }if(artikMi==true){
            System.out.println("Artık Yildir");
        }else{
            System.out.println("Artık Yıl Değildir");
        }
    }
}
