import java.util.ArrayList;

public class CustomerManager implements IBaseDal {
    ArrayList<Customer> customers = new ArrayList<Customer>();


    @Override
    public void Add(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getFirsName() + "Bu Customer Eklendi..");

    }

    @Override
    public void Update(Customer customer) {
        System.out.println(customer.getFirsName() + "Bu Customer Güncellendi");

    }

    @Override
    public void Delete(Customer customer) {
        System.out.println(customer.getFirsName() + "Bu Customer Silindi..");

    }

    @Override
    public Customer getbyId(int id) {
        Customer getCustomer = null;
        for (Customer cust : customers) {
            if (cust.getId() == id) {
                getCustomer = cust;

            }
        }
        return getCustomer;
    }

    @Override
    public ArrayList<Customer> getAll() {

        return customers;
    }
}
