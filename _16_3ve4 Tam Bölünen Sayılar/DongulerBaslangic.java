import java.util.Scanner;

public class DongulerBaslangic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam=0, counter=0;
        System.out.print("Bir Sayi Gir1iniz : ");
        sayi=input.nextInt();

        for ( int i=1;i<=sayi;i++){
            if (i%12==0){
                toplam+=i;
                counter++;
                System.out.println("3 ve 4'e Tam Bölünen sayilar :  " + i);
            }
        }

        System.out.println("Ortalama "+toplam/counter);


    }
}
