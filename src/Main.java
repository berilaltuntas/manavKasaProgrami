import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        double afiyat,efiyat,dfiyat,mfiyat,pfiyat,total;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen aldığınız meyve ve sebzelerin miktarını kg cinsinden yazınız.");
        System.out.println("Almadığınız ürünler için 0 tuşlayınız");

        System.out.print("Armut: " );
        armut= input.nextDouble();

        System.out.print("Elma: ");
        elma= input.nextDouble();

        System.out.print("Domates: " );
        domates= input.nextDouble();

        System.out.print("Muz: " );
        muz= input.nextDouble();

        System.out.print("Patlıcan: " );
        patlican= input.nextDouble();

    //Kullanıcıdan aldığımız ürünlerin fiyatını hesaplıyoruz.
        afiyat= armut*2.14;
        efiyat= elma*3.67;
        dfiyat=domates*1.11;
        mfiyat=muz*0.95;
        pfiyat=patlican*5.00;
        total = (afiyat+efiyat+dfiyat+mfiyat+pfiyat);
        System.out.println("Ödeyeceğiniz Tutar(TL):" +total);
    }
}