import java.util.Scanner;

public class vucutKutleindeks {
    public static void main(String[] args) {

        double kg,boy,indeks;
        Scanner input = new Scanner(System .in);
        System.out.print("Boyunuzu Giriniz (mt cinsinden) : ");
        boy= input.nextDouble();
        System.out.print("Kilonuzu Giriniz (KG cinsinden) : ");
        kg= input.nextDouble();
        indeks=kg/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+indeks);

    }

}
