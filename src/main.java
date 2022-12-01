import java.util.Scanner;
public class main {
    public static void main (String [] args){
        Scanner inp = new Scanner(System.in);
        int deger, toplam = 0;
        System.out.print("Bir sayı giriniz : ");
        deger = inp.nextInt();
        do {
           toplam += deger %10;
           deger /= 10;
        }while(deger > 0);
        System.out.print("Rakamları Toplamı : " + toplam);

    }
}
