public class Main {
    public static void main(String[] args)
    {
        int [] sayilar=new int[]{1,2,3,5,6,80};
        int aranacak=9;
        boolean varMi=false;

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayı Mevcuttur.");
        }else{
            System.out.println("Sayı mevcut değildir.");
        }
    }
}