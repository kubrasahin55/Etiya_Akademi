public class MysqlCustomerDal implements ICustomerDal,IRepository {
    @Override
    public void Add() {
        System.out.println("My sql eklendi.");
    }
}
