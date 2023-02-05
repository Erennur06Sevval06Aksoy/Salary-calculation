
package nyp.vize.pkg2.soru;
import java.util.Scanner; 
public class NypVize2Soru {
   public static class personel
        {
            String ad,soyad;
            int cocukSayi,yil;
            double maas;                    
   public  void personel(){
       personel x=new personel();
        Scanner a=new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        ad=a.next();
        System.out.print("Soyadınızı giriniz: ");
        soyad=a.next();
        System.out.print("Çocuk sayısını giriniz: ");
        cocukSayi=a.nextInt(); 
        System.out.print("Maaşınızı giriniz: ");
        maas=a.nextInt();
        System.out.print("Kaç yıl sonrası maaşınızın hesaplanmasını istersiniz? ");
        yil=a.nextInt();   
   }
   public void zamHesapla(personel x){
       int zam=1,artıs=1;
    if (maas<1000) {
           zam=(int) (maas+((maas*3)/100)+(cocukSayi*42));
           artıs=(int) (zam-maas);
       }
       if (x.maas>=1000 && maas<2500) {
           zam=(int) (maas+((maas*4)/100)+(cocukSayi*42));
           artıs=(int) (zam-maas);
       }
       if (x.maas>=2500) {
           zam=(int) (maas+((maas*5)/100)+(cocukSayi*42));
           artıs=(int) (zam-maas);
       }
       System.out.println(ad+" "+soyad+" Eski maaşı: "+maas+" Yeni maaşı:"+zam+" Zam:"+artıs);
}
   public void yilHesapla(personel x){
       int yill=1;
       yill=(int) (yil*maas);
       System.out.println(yil+" Yıl sonraki maaşınız: "+yill);
   }
   }
    public static void main(String[] args) {
        personel x=new personel();
        x.personel();
        x.zamHesapla(x);
        x.yilHesapla(x);
        Scanner w=new Scanner(System.in);
        System.out.println("Devam etmek için 1, çkmak için 2 tuşlayınız.");
        int sayi=w.nextInt();
        while(sayi==1){
        x.personel();
        x.zamHesapla(x);
        x.yilHesapla(x);
        System.out.println("Devam etmek için 1, çkmak için 2 tuşlayınız.");
            if (sayi==2) {
                break;
            }
        }
    }   
}


