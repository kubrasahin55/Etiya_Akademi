public class Main {
    public static void main(String[] args)
    {
        sayiBulmaca();


    }
    public static  void sayiBulmaca(){
        int [] sayilar =new int[] {1,2,5,6};
        int aranacak=6;
        boolean varMi=false;

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayı mevcuttur: "+aranacak);
        }
        else {
            System.out.println("Sayı mevcut değildir: "+aranacak);
        }
    }
    //javada metot isimleri camelCase yazılır.class isimleri ise PascalCase yazılır

    public static void mesajVer(String mesaj) //parametreli method
    {
        System.out.println(mesaj);
    }

}