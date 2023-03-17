import java.util.Scanner;

public class BurcHesabi {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Gün giriniz : ");
        day = input.nextInt();
        System.out.print("Ay giriniz : ");
        month = input.nextInt();
        if (month == 1) {
            if (day >= 1 && day < 31) {
                if (day < 22) {
                    horoscope = "Oğlak";
                } else  {
                    horoscope = "Kova";
                }

            }
        } else if (month==2) {
            if(day >= 1 && day < 28){
                if (day < 20) {
                    horoscope = "Kova";
           }
            }
            else {
                horoscope = "Balık";
            }
        } else if (month==3) {
            if(day >= 1 && day < 31){
                if (day < 21) {
                    horoscope = "Balık";
            }

            } else {
                horoscope = "Koç";
            }
        } else if (month==4) {
            if (day >= 1 && day < 30)
            {if(day<22){
                horoscope = "Koç";
            }

            } else {
                horoscope = "Boğa";
            }
        }else if (month==5) {
            if (day >= 1 && day < 31)
            {if(day<23){
                horoscope = "Boğa";
            }

            } else {
                horoscope = "İkizler";
            }
        }else if (month==6) {
            if (day >= 1 && day < 30)
            {if(day<23){
                horoscope = "İkizler";
            }

            } else {
                horoscope = "Yengeç";
            }
        }else if (month==7) {
            if (day >= 1 && day < 31)
            {if(day<23){
                horoscope = "Yengeç";
            }

            } else {
                horoscope = "Aslan";
            }
        }else if (month==8) {
            if (day >= 1 && day < 31)
            {if(day<23){
                horoscope = "Aslan";
            }

            } else {
                horoscope = "Başak";
            }
        }else if (month==9) {
            if (day >= 1 && day < 30)
            {if(day<23){
                horoscope = "Başak";
            }

            } else {
                horoscope = "Terazi";
            }
        }else if (month==10) {
            if (day >= 1 && day < 31)
            {if(day<23){
                horoscope = "Terazi";
            }

            } else {
                horoscope = "Akrep";
            }
        }else if (month==11) {
            if (day >= 1 && day < 30)
            {if(day<22){
                horoscope = "Akrep";
            }

            } else {
                horoscope = "Yay";
            }
        }else if (month==12) {
            if (day >= 1 && day < 30)
            {if(day<22){
                horoscope = "Yay";
            }

            } else {
                horoscope = "Oğlak";
            }
        }
        System.out.println("Burcunuz " + horoscope);

    }
}