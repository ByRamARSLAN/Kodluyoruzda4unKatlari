import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, sub = 0;
        Scanner number = new Scanner(System.in);

        do{
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi = number.nextInt();
            if(sayi % 4 == 0){
                sub += sayi;
            }
        }while(sayi % 2 == 0);

        System.out.println("4\'ün katları olarak girilen sayıların toplamı : " + sub);
    }
}