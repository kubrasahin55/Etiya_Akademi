import java.util.ArrayList;

public interface IBaseDal {
 void Add(Customer customer);
 void Update(Customer customer);
 void Delete(Customer customer);

 Customer getbyId(int id);
 ArrayList<Customer> getAll();



}
