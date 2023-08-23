import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double urun1,kdv= 0.20,vergi,fiyat1;
        System.out.print("Ürün 1 fiyatını giriniz:");
        urun1 = input.nextDouble();
        vergi = kdv*urun1;
        fiyat1 = urun1 + (kdv*urun1);
        System.out.println("KDV'siz Tutar:" +urun1);
        System.out.println("KDV Tutarı :" +vergi);
        System.out.print("KDV'li Tutar :" +fiyat1);






    }
}
