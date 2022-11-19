public class Main {
    public static void main(String[] args)
    {
        //classlar referan tiptir.
       CustomerManager customerManager=new CustomerManager() ;
       CustomerManager customerManager2=new CustomerManager();
       customerManager=customerManager2;
       customerManager.Add();
       customerManager.Remove();
       customerManager.Update();

    }
}
//claslar methodları gruplar.

