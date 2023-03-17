import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int number = input.nextInt();
        int total=0;
        for (int  i=1;i<number;i++){
            if(number%i==0){
                total+=i;
            }
        }if (total==number){
            System.out.println("Mükemmel Sayıdır : "+number);
        }else{
            System.out.println("Mükemmel Sayi Değildir");
        }
    }
}
