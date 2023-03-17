import java.util.Scanner;

public class Kombinasyon{

    public static void main(String[] args) {
        int n,carpim1=1,carpim2=1,carpim3=1,r,i,j,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Grup Sayisi Giriniz : ");
        n=input.nextInt();
        System.out.print("Bir Eleman Giriniz : ");
        r=input.nextInt();
        for (i=1;i<=n;i++){

            carpim1*=i;
        }
        for(j=1;j<=r;j++){
            carpim2*=j;
        }
       int fark=n-r;
        for (k=1;k<=fark;k++){
            carpim3*=k;
        }
        int kombinayon;
        kombinayon=carpim1/(carpim2*(carpim3));
        System.out.print("İşlemin Kominasyonu : "+kombinayon);
    }
}
