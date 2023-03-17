import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N1 Sayısını Giriniz : ");
        int n1 = input.nextInt();
        System.out.print("N2 Sayısını Giriniz : ");
        int n2 = input.nextInt();
        int i = 1;
        int ebob = 1;
        
        while(i<=n1){
            i++;
            if( n1%i==0 &&n2%i==0){

                ebob=i;
            }


        }
        System.out.println("Ebob : "+ebob);
        int ekok= (n1*n2)/ebob;
        System.out.println("Ekok : "+ekok);

    }
}