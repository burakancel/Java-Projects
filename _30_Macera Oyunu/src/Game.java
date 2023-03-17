import java.util.Scanner;

public class Game {



    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz.");
        System.out.println("Lütfen Bir İsim Giriniz");
        String playerName=input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın "+player.getName()+" Bu Karanlık ve Sisli Adaya Hoşgeldiniz !!! \"Burada yaşananların hepdi gerçek\"");
        System.out.println("Lütfen Bir Karakter Seçiniz");
        player.selectChar();

        Location location = null;
        while (true){
            player.printInfo();
            System.out.println("Bölgeler :  ");
            System.out.println("1 . Güvemli Ev");
            System.out.println("2 . Eşya Dükkanı");
            System.out.println("3 . Mağara -->> Mağaraya Gir Zombi Çıkabilir *Ödül : Yemek *");
            System.out.println("4 . Orman -->> Orman Gir Vampir Çıkabilir * Ödül : Odun * ");
            System.out.println("5 . Nehir -->> Nehir'e Gir Ayı Çıkabilir * Ödül : Su *");
            System.out.println("0 . Çıkış Yap");
            System.out.println("Lütfen Gitmek İstediğiniz Bölgeyi Seçiniz");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0:
                    location=null;
                    break;
                case 1 :
                    location = new SafeHouse(player);
                    break;
                case 2 :
                    location = new ToolStore(player);
                    break;
                case 3:
                    location= new Cave(player);
                    break;
                case 4:
                    location= new Forest(player);
                    break;
                case 5:
                    location= new River(player);
                    break;
                default:
                    System.out.println("lütfen Geçerli Bir Bölge Giriniz");
                    break;
            }
            if(location== null){
                System.out.println("Oyun Bitti Yine Bekleriz");
                break;
            }
            if(!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }


    }
}
