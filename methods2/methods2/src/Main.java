public class Main {
    public static void main(String[] args)
    {
        String mesaj="Bugün hava güzel";
        //String yeniMesaj=mesaj.substring(0,2); //subs bir değer return ediyor.
       // System.out.println(yeniMesaj);
        String yeniMesaj=sehirVer();
        System.out.println(yeniMesaj);
        int sayi=topla(50,5);
        System.out.println(sayi);
        int toplam=topla2(2,3,4,6,5);
        System.out.println(toplam);

    }
    public static void ekle()
    {

    }
    public static void sil()
    {

    }
    public static void güncelle()
    {

    }
    public static String sehirVer(){
        return "Samsun";
    }
    public static int topla(int sayi1,int sayi2)
    {
     return sayi1+sayi2;
    }
    public static int topla2(int... sayilar) //int in sonuna üç nokta koyduğunda birden fazla int array gibi çalışcak
    { //burdaki int sayılardaki sayılar arka planda bir dizidir.

        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}