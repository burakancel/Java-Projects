import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int n;
        double toplam=0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayiyisini Girin : ");
        n=input.nextInt();
        for(int i =1; i<=n;i++){
            toplam+=(1.0/i);
        }
        System.out.println("Harmonik Sayi : "+toplam);
    }
}
