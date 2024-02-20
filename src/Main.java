import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int km; //kullanıcıdan alınan değer
       double perkm=2.20, startPrice=10, total;

        System.out.print("Km cinsinden mesafeyi giriniz : ");
        Scanner input=new Scanner(System.in);
        km=input.nextInt();

        total=(km*perkm);
        total+=startPrice;
        total=(total<20)? 20: total;
        System.out.print("Toplam Tutar : "+total);

    }
}