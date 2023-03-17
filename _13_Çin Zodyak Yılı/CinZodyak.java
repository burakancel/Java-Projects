import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı Giriniz : ");
        yil=input.nextInt();
        if(yil%12==0){
            System.out.println("Maymun");
        }
        else if(yil%12==1){
            System.out.println("Horoz");
        }
        else if(yil%12==2){
            System.out.println("Köpek");
        }
        else if(yil%12==3){
            System.out.println("Domuz");
        }
        else if(yil%12==4){
            System.out.println("Fare");
        }
        else if(yil%12==5){
            System.out.println("Öküz");
        }else if(yil%12==6){
            System.out.println("Kaplan");
        }else if(yil%12==7){
            System.out.println("Tavşan");
        }else if(yil%12==8){
            System.out.println("Ejderha");
        }else if(yil%12==9){
            System.out.println(" Yılan");
        }else if(yil%12==10){
            System.out.println("At");
        }else if(yil%12==11){
            System.out.println("Koyun");
        }
    }
}
