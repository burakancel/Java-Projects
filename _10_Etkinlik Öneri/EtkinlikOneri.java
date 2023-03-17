import java.util.Scanner;

public class EtkinlikOneri {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat=input.nextInt();
        if(heat<5){
            System.out.println("Kayak Yapmaya Gidin");
        }else if(heat>=5 &&heat<15){
            System.out.println("Sinemaya Git");
        }else if(heat>=15&&heat<25){
            System.out.println("Pikniğe Git");
        }else {
            System.out.println("Yüzmeye Git");
        }



        }

    }

